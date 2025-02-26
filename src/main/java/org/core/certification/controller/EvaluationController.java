package org.core.certification.controller;

import lombok.AllArgsConstructor;
import org.core.certification.model.Evaluation;
import org.core.certification.service.EvaluationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("evaluation")
public class EvaluationController {
    private EvaluationService service;

    @PostMapping("/create")
    public ResponseEntity<Evaluation> createEvaluation(@RequestBody Evaluation evaluation) {
        Evaluation createdEvaluation = service.createEvaluation(evaluation);
        return new ResponseEntity<>(createdEvaluation, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Evaluation> getEvaluationById(@PathVariable Long id) {
        Evaluation evaluation = service.getEvaluationById(id);
        return ResponseEntity.ok(evaluation);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvaluation(@PathVariable Long id) {
        service.deleteEvaluation(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Evaluation>> getAllEvaluations() {
        List<Evaluation> evaluations = service.getAllEvaluation();
        return ResponseEntity.ok(evaluations);
    }
}
