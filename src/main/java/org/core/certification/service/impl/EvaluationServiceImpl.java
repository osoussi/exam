package org.core.certification.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.core.certification.model.Evaluation;
import org.core.certification.repository.EvaluationRepository;
import org.core.certification.service.EvaluationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EvaluationServiceImpl implements EvaluationService {

    private EvaluationRepository evaluationRepository;

    @Override
    public Evaluation createEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public Evaluation getEvaluationById(Long id) {
        return evaluationRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Evaluation not found with id: " + id));
    }

    @Override
    public void deleteEvaluation(Long id) {
        evaluationRepository.deleteById(id);
    }

    @Override
    public List<Evaluation> getAllEvaluation() {
        return evaluationRepository.findAll();
    }
}
