package com.example.performance_lab.controller;

import com.example.performance_lab.entity.Customer;
import com.example.performance_lab.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    @GetMapping
    public List<Customer> get() {
        return service.getCustomers();
    }
}
