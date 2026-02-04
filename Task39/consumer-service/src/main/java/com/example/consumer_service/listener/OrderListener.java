package com.example.consumer_service.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderListener {

    @RabbitListener(queues = "order.queue")
    public void receiveMessage(String message) {
        System.out.println("Received Message: " + message);
    }
}
