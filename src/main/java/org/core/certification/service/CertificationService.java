package org.core.certification.service;

import org.core.certification.model.Certification;

import java.util.List;

public interface CertificationService {
    Certification createCertification(Certification certification);

    Certification getCertificationById(Long id);

    void deleteCertification(Long id);

    List<Certification> getAllCertification();
}
