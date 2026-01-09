package com.example.Task25_B.service;
import com.example.Task25_B.entity.Course;
import com.example.Task25_B.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;


    public Course save(Course course) {
        return repository.save(course);
    }

    public List<Course> getAll() {
        return repository.findAll();
    }

    public Course getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Course update(Long id, Course course) {
        course.setId(id);
        return repository.save(course);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
