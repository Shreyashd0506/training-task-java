package com.example.Task25_A;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
   private StudentRepository studentRepository;

    public int save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(int id){
        return studentRepository.findById(id);
    }

    public int update(Student student){
        return studentRepository.update(student);
    }

    public int delete(int id){
        return studentRepository.delete(id);
    }

}
