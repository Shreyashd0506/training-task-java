package org.springdemo;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String getStudentName() {
        return "Shreyash";
    }
}