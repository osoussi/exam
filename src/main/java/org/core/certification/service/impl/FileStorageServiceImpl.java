package org.core.certification.service.impl;

import org.core.certification.service.FileStorageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Value("${file.path}")
    private String filePath;

    @Override
    public void saveFile(MultipartFile file) {
        String directory = System.getProperty("user.dir") + '/' + filePath;
        try {
            file.transferTo(new File(directory + '/' + file.getOriginalFilename()));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
