package org.core.certification.controller;

import lombok.AllArgsConstructor;
import org.core.certification.service.FileStorageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@AllArgsConstructor
@RequestMapping("/files")
public class FileUploadController {
    private FileStorageService fileStorageService;

    @PostMapping("/upload")
    public void uploadFile(@RequestParam MultipartFile file) {
        fileStorageService.saveFile(file);
    }
}
