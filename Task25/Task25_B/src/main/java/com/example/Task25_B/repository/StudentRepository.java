package com.example.Task25_B.repository;

import com.example.Task25_B.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
