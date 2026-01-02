package org.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired   // Dependency Injection
    private StudentRepository repository;

    public void displayStudent() {
        System.out.println("Student Name: " + repository.getStudentName());
    }
}
