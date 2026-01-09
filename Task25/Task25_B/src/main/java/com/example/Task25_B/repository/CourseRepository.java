package com.example.Task25_B.repository;

import com.example.Task25_B.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
