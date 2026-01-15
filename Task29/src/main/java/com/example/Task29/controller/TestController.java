package com.example.Task29.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // Public API (no authentication required)
    @GetMapping("/public")
    public String publicApi() {
        return "This is a public API";
    }

    // USER role required
    @GetMapping("/user")
    public String userApi() {
        return "Hello USER, you have access!";
    }

    // ADMIN role required
    @GetMapping("/admin")
    public String adminApi() {
        return "Hello ADMIN, you have full access!";
    }
}
