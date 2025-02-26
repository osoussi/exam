package org.core.certification.service;

import org.core.certification.model.Exam;

import java.util.List;

public interface ExamService {
    Exam createExam(Exam exam);

    Exam getExamById(Long id);

    void deleteExam(Long id);

    List<Exam> getAllExams();
}
