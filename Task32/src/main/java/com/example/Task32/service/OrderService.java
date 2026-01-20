package com.example.Task32.service;

import com.example.Task32.model.Order;
import com.example.Task32.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    // Business logic: calculate total
    public Order createOrder(Order order) {

        if (order.getQuantity() <= 0) {
            throw new IllegalArgumentException("Invalid quantity");
        }

        double total = order.getPrice() * order.getQuantity();
        order.setTotalAmount(total);

        return repository.save(order);
    }
}
