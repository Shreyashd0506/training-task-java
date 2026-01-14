package com.example.Task28;


import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {


        boolean appIsHealthy = true;

        if (appIsHealthy) {
            return Health.up()
                    .withDetail("message", "Application is healthy")
                    .build();
        }

        return Health.down()
                .withDetail("message", "Application is down")
                .build();
    }
}
