package org.core.certification.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.core.certification.model.Exam;
import org.core.certification.repository.ExamRepository;
import org.core.certification.service.ExamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ExamServiceImpl implements ExamService {
    private ExamRepository examRepository;

    @Override
    public Exam createExam(Exam exam) {
        return examRepository.save(exam);
    }

    @Override
    public Exam getExamById(Long id) {
        return examRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Exam not found with id: " + id));
    }

    @Override
    public void deleteExam(Long id) {
        examRepository.deleteById(id);
    }

    @Override
    public List<Exam> getAllExams() {
        return examRepository.findAll();
    }
}
