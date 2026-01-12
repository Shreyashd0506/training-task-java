package com.example.Task26;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    // Create student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // Create multiple students (saveAll + flush)
    @PostMapping("/bulk")
    public List<Student> createStudents(@RequestBody List<Student> students) {
        return service.saveAllStudents(students);
    }

    // Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // Get student by ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // Delete student
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }

    // Pagination & sorting
    @GetMapping("/page")
    public Page<Student> getStudentsPage(
            @RequestParam int page,
            @RequestParam int size,
            @RequestParam(defaultValue = "id") String sortBy) {
        return service.getStudentsWithPagination(page, size, sortBy);
    }

    // Multi-field sorting
    @GetMapping("/multi-sort")
    public Page<Student> getStudentsMultiSort(
            @RequestParam int page,
            @RequestParam int size) {
        return service.getStudentsWithMultiSort(page, size);
    }

    // Derived query
    @GetMapping("/department/{dept}")
    public List<Student> getByDepartment(@PathVariable String dept) {
        return service.getByDepartment(dept);
    }

    // Native query
    @GetMapping("/age/{age}")
    public List<Student> getByAgeNative(@PathVariable int age) {
        return service.getStudentsByAgeNative(age);
    }
}
