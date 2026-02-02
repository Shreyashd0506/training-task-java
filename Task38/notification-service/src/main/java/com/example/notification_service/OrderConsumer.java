package com.example.notification_service;

import com.example.common.Order;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {

    @KafkaListener(
            topics = "order-events",
            groupId = "notification-group"
    )
    public void consumeOrder(
            Order order,
            Acknowledgment acknowledgment
    ) {
        try {
            System.out.println("Order Received: " + order.getProduct());

            // Simulate notification
            System.out.println("Sending notification for Order ID: " + order.getOrderId());

            // Manually commit offset
            acknowledgment.acknowledge();

        } catch (Exception e) {
            System.out.println("Error processing order");
        }
    }
}
