package com.example.Task31.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/*
 This class stores file details (metadata)
 In real apps, this goes to DB
 */
@Getter
@Setter
public class FileMetadata {

    private Long id;
    private String fileName;
    private String fileType;
    private long fileSize;
    private String filePath;
    private LocalDateTime uploadTime;

}
