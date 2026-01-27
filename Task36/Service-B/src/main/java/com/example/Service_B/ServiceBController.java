package com.example.Service_B;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/service-b/message")
    public String getMessage() {

        // Simple response from Service-B
        return "Hello from Service B!";
    }
}

