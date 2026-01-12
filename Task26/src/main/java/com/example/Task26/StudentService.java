package com.example.Task26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // Create or Update
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // saveAll() & flush behavior
    public List<Student> saveAllStudents(List<Student> students) {
        List<Student> savedStudents = repository.saveAll(students);
        repository.flush(); // Forces immediate DB write
        return savedStudents;
    }

    // Read
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Delete
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }

    // Pagination & Sorting
    public Page<Student> getStudentsWithPagination(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repository.findAll(pageable);
    }

    // Multiple sorting fields
    public Page<Student> getStudentsWithMultiSort(int page, int size) {
        Pageable pageable = PageRequest.of(
                page,
                size,
                Sort.by("department").ascending().and(Sort.by("age").descending())
        );
        return repository.findAll(pageable);
    }

    // Derived queries
    public List<Student> getByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    // Native query
    public List<Student> getStudentsByAgeNative(int age) {
        return repository.findStudentsWithAgeGreaterThanNative(age);
    }
}
