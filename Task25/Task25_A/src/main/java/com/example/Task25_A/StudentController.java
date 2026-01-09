package com.example.Task25_A;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;


    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {
        service.save(student);
        return new ResponseEntity<>("Student created successfully", HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = service.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        Student student = service.findById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable int id,@RequestBody Student student) {
        student.setId(id);
        service.update(student);
        return new ResponseEntity<>("Student updated successfully", HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Student deleted successfully", HttpStatus.OK);
    }
}
