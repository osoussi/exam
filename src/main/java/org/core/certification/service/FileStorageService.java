package org.core.certification.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    void saveFile(MultipartFile file);}
