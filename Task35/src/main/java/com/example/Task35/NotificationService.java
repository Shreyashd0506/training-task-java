package com.example.Task35;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async("taskExecutor") // Uses custom thread pool
    public void sendNotification(String message) {

        System.out.println(
                "Notification started by thread: " +
                        Thread.currentThread().getName()
        );

        try {
            // Simulate delay (like email/SMS)
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Notification sent: " + message);
    }
}
