package com.example.Service_A;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceAController {

    // REST endpoint of Service-B
    private final String SERVICE_B_URL = "http://localhost:8082/service-b/message";

    @GetMapping("/service-a/call-service-b")
    public String callServiceB() {

        // RestTemplate is used to call another REST service
        RestTemplate restTemplate = new RestTemplate();

        // Calling Service-B API
        String response = restTemplate.getForObject(SERVICE_B_URL, String.class);

        return "Response from Service B: " + response;
    }
}

