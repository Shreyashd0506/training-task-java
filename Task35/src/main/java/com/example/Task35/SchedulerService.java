package com.example.Task35;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SchedulerService {

    private final NotificationService notificationService;

    public SchedulerService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Runs every 10 minutes
    @Scheduled(cron = "0 */5 * * * ?")
    public void logDataJob() {

        System.out.println(
                "Scheduled job started at: " + LocalDateTime.now()
        );

        // Call async method
        notificationService.sendNotification("Scheduled job notification");

        System.out.println("Scheduled job completed");
    }
}
