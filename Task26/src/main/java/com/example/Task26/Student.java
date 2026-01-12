package com.example.Task26;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "students")
@EntityListeners(AuditingEntityListener.class)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private int age;
    private String department;

    // Automatically set when record is created
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    // Automatically updated when record is modified
    @LastModifiedDate
    private LocalDateTime updatedAt;

}
