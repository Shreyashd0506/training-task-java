package com.example.Task31.controller;



import com.example.Task31.model.FileMetadata;
import com.example.Task31.service.FileService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileService service;

    public FileController(FileService service) {
        this.service = service;
    }

    // Upload file
    @PostMapping("/upload")
    public FileMetadata upload(@RequestParam MultipartFile file) throws Exception {
        return service.uploadFile(file);
    }

    // Download file
    @GetMapping("/download/{id}")
    public ResponseEntity<FileSystemResource> download(@PathVariable Long id) {

        File file = service.getFile(id);
        FileSystemResource resource = new FileSystemResource(file);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + file.getName() + "\"")
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }

    // Display image
    @GetMapping("/image/{id}")
    public ResponseEntity<FileSystemResource> viewImage(@PathVariable Long id) {

        File file = service.getFile(id);
        return ResponseEntity.ok()
                .contentType(MediaType.IMAGE_JPEG)
                .body(new FileSystemResource(file));
    }

    // Generate PDF
    @GetMapping("/generate-pdf")
    public ResponseEntity<FileSystemResource> generatePdf() throws Exception {

        File pdf = service.generatePdf("Hello PDF from Spring Boot!");

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION,
                        "attachment; filename=\"" + pdf.getName() + "\"")
                .contentType(MediaType.APPLICATION_PDF)
                .body(new FileSystemResource(pdf));
    }
}
