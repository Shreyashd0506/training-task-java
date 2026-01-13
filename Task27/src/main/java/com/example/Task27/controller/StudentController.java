package com.example.Task27.controller;

import com.example.Task27.exception.ResourcesNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {


     // test 404 handling
    @GetMapping("/not-found")
    public String studentNotFound() {
        throw new ResourcesNotFoundException("Student not found with given ID");
    }


     // test 500 handling
    @GetMapping("/error")
    public String genericError() {
        throw new RuntimeException("Unexpected error occurred");
    }
}
