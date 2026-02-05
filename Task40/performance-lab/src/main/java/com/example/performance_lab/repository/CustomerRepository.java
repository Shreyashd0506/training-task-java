package com.example.performance_lab.repository;

import com.example.performance_lab.entity.Customer;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    // N+1 Fix using EntityGraph
    @EntityGraph(attributePaths = "addresses")
    List<Customer> findAll();
}
