package org.core.certification.service.impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.core.certification.model.Certification;
import org.core.certification.repository.CertificationRepository;
import org.core.certification.service.CertificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CertificationServiceImpl implements CertificationService {

    private CertificationRepository certificationRepository;

    @Override
    public Certification createCertification(Certification certification) {
        return certificationRepository.save(certification);
    }

    @Override
    public Certification getCertificationById(Long id) {
        return certificationRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Certification not found with id: " + id));
    }

    @Override
    public void deleteCertification(Long id) {
        certificationRepository.deleteById(id);
    }

    @Override
    public List<Certification> getAllCertification() {
        return certificationRepository.findAll();
    }
}
