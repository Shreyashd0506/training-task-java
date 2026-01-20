package com.example.Task32.integration;

import com.example.Task32.model.Order;
import com.example.Task32.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class OrderIntegrationTest {

    @Autowired
    private OrderService service;

    @Test
    void endToEndOrderCreation() {
        Order order = new Order();
        order.setPrice(100);
        order.setQuantity(3);

        Order saved = service.createOrder(order);

        assertEquals(300, saved.getTotalAmount());
    }
}
