package com.example.Task33.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Operation(
            summary = "Admin dashboard",
            description = "Access admin-only dashboard"
    )
    @GetMapping("/dashboard")
    public String dashboard() {
        return "Welcome To Admin Dashboard";
    }
}
