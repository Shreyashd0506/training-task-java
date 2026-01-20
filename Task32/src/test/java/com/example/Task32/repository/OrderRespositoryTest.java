package com.example.Task32.repository;

import com.example.Task32.model.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
@ActiveProfiles("test")
class OrderRepositoryTest {

    @Autowired
    private OrderRepository repository;

    @Test
    void shouldSaveAndFetchOrder() {
        Order order = new Order();
        order.setProductName("Mobile");
        order.setPrice(10000);
        order.setQuantity(1);

        Order saved = repository.save(order);

        assertTrue(repository.findById(saved.getId()).isPresent());
    }
}
