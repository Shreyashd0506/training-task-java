package com.example.order_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service") // Service name from Eureka
public interface UserClient {

    @GetMapping("/users/{id}")
    String getUser(@PathVariable("id") int id);
}
