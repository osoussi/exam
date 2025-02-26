package org.core.certification.controller;

import lombok.AllArgsConstructor;
import org.core.certification.model.Exam;
import org.core.certification.service.ExamService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("exam")
public class ExamController {
    private ExamService service;

    @PostMapping("/create")
    public ResponseEntity<Exam> createExam(@RequestBody Exam exam) {
        Exam createdExam = service.createExam(exam);
        return new ResponseEntity<>(createdExam, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Exam> getExamById(@PathVariable Long id) {
        Exam exam = service.getExamById(id);
        return ResponseEntity.ok(exam);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteExam(@PathVariable Long id) {
        service.deleteExam(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Exam>> getAllExams() {
        List<Exam> exams = service.getAllExams();
        return ResponseEntity.ok(exams);
    }
}
