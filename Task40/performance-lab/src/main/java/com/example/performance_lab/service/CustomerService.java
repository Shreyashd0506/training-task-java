package com.example.performance_lab.service;

import com.example.performance_lab.entity.Customer;
import com.example.performance_lab.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repo;

    public List<Customer> getCustomers() {
        return repo.findAll();    //resolved N+1
    }
}
