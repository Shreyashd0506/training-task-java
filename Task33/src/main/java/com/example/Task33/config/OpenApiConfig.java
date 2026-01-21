package com.example.Task33.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Swagger Demo API",
                version = "1.0",
                description = "REST API documentation using OpenAPI & Swagger UI"
        ),
        servers = {
                @Server(
                        description = "Development Server",
                        url = "http://localhost:8080"
                )
        }
)
public class OpenApiConfig {
}
