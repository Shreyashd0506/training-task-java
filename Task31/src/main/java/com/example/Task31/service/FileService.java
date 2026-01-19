package com.example.Task31.service;

import com.example.Task31.exception.FileNotFoundException;
import com.example.Task31.model.FileMetadata;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class FileService {

    private static final String UPLOAD_DIR = "uploads/";
    private static final String PDF_DIR = "generated-pdf/";

    private Map<Long, FileMetadata> fileDB = new HashMap<>();
    private long counter = 1;

    // Upload file
    public FileMetadata uploadFile(MultipartFile file) throws IOException {

        // Validation
        if (file.getSize() > 5 * 1024 * 1024)
            throw new RuntimeException("File size exceeds 5MB");

        Files.createDirectories(Paths.get(UPLOAD_DIR));

        String filePath = UPLOAD_DIR + file.getOriginalFilename();
        Files.copy(file.getInputStream(), Paths.get(filePath),
                StandardCopyOption.REPLACE_EXISTING);

        FileMetadata meta = new FileMetadata();
        meta.setId(counter++);
        meta.setFileName(file.getOriginalFilename());
        meta.setFileType(file.getContentType());
        meta.setFileSize(file.getSize());
        meta.setFilePath(filePath);
        meta.setUploadTime(LocalDateTime.now());

        fileDB.put(meta.getId(), meta);
        return meta;
    }

    // Download file
    public File getFile(Long id) {
        FileMetadata meta = fileDB.get(id);
        if (meta == null)
            throw new FileNotFoundException("File not found");

        return new File(meta.getFilePath());
    }

    // Generate PDF
    public File generatePdf(String content) throws Exception {

        Files.createDirectories(Paths.get(PDF_DIR));

        String fileName = "sample_" + System.currentTimeMillis() + ".pdf";
        File pdf = new File(PDF_DIR + fileName);

        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(pdf));

        document.open();
        document.add(new Paragraph(content));
        document.close();

        return pdf;
    }
}
