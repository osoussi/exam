package org.core.certification.controller;

import lombok.AllArgsConstructor;
import org.core.certification.model.Certification;
import org.core.certification.service.CertificationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("certification")
public class CertificationController {
    private CertificationService service;

    @PostMapping("/create")
    public ResponseEntity<Certification> createCertification(@RequestBody Certification certification) {
        Certification createdCertification = service.createCertification(certification);
        return new ResponseEntity<>(createdCertification, HttpStatus.CREATED);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Certification> getCertificationById(@PathVariable Long id) {
        Certification certification = service.getCertificationById(id);
        return ResponseEntity.ok(certification);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCertification(@PathVariable Long id) {
        service.deleteCertification(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<Certification>> getAllCertifications() {
        List<Certification> exams = service.getAllCertification();
        return ResponseEntity.ok(exams);
    }
}
