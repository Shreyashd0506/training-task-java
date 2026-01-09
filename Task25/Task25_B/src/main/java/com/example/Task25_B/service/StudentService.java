package com.example.Task25_B.service;

import com.example.Task25_B.entity.Student;
import com.example.Task25_B.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    // READ ALL
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    // READ BY ID
    public Student getById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    // UPDATE (PERFECT WAY)
    public Student update(Long id, Student student) {
        Student existingStudent = getById(id); // check existence

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setAddress(student.getAddress());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public void delete(Long id) {
        getById(id); // existence check
        studentRepository.deleteById(id);
    }
}