package com.example.Task33.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public")
public class PublicController {

    @Operation(
            summary = "Get welcome message",
            description = "Returns a simple welcome message for public users"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Successful response"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
    })
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Public API";
    }

    @Operation(
            summary = "Get user by ID",
            description = "Fetch user details using user ID"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "User found"),
            @ApiResponse(responseCode = "400", description = "Invalid user ID"),
            @ApiResponse(responseCode = "404", description = "User not found")
    })
    @GetMapping("/users/{id}")
    public String getUser(
            @Parameter(
                    description = "Unique user ID",
                    example = "101",
                    required = true
            )
            @PathVariable int id
    ) {
        return "User ID: " + id;
    }
}
