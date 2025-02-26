package org.core.certification.service;

import org.core.certification.model.Evaluation;

import java.util.List;

public interface EvaluationService {
    Evaluation createEvaluation(Evaluation evaluation);

    Evaluation getEvaluationById(Long id);

    void deleteEvaluation(Long id);

    List<Evaluation> getAllEvaluation();
}
