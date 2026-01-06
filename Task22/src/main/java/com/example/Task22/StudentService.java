package com.example.Task22;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // DTO <-> Entity Conversion
    private StudentDTO toDTO(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getAge()
        );
    }

    private Student toEntity(StudentDTO dto) {
        Student student = new Student();
        student.setName(dto.getName());
        student.setAge(dto.getAge());
        return student;
    }


    public StudentDTO addStudent(StudentDTO dto) {
        Student student = toEntity(dto);
        Student savedStudent = repository.save(student);
        return toDTO(savedStudent);
    }


    public List<StudentDTO> getAllStudents() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }


    public StudentDTO getStudentById(int id) {
        Student student = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        return toDTO(student);
    }


    public StudentDTO updateStudent(int id, StudentDTO dto) {
        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        existingStudent.setName(dto.getName());
        existingStudent.setAge(dto.getAge());

        Student updatedStudent = repository.save(existingStudent);
        return toDTO(updatedStudent);
    }

    
    public void deleteStudent(int id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        repository.deleteById(id);
    }
}
