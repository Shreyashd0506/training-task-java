package com.example.Task26;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    //  Derived Query Methods
    List<Student> findByDepartment(String department);

    List<Student> findByAgeGreaterThan(int age);

    // Pagination with derived query
    Page<Student> findByDepartment(String department, Pageable pageable);

    //  Native SQL Query
    @Query(value = "SELECT * FROM students WHERE age > ?1", nativeQuery = true)
    List<Student> findStudentsWithAgeGreaterThanNative(int age);
}
