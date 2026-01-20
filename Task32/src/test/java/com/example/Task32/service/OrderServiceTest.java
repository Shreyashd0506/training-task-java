package com.example.Task32.service;

import com.example.Task32.model.Order;
import com.example.Task32.repository.OrderRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("Order Service Unit Tests")
class OrderServiceTest {

    @Mock
    private OrderRepository repository;

    @InjectMocks
    private OrderService service;

    @Test
    @Tag("unit")
    void shouldCalculateTotalCorrectly() {
        Order order = new Order();
        order.setPrice(100);
        order.setQuantity(2);

        when(repository.save(any())).thenReturn(order);

        Order result = service.createOrder(order);

        assertEquals(200, result.getTotalAmount());
        verify(repository).save(order);
    }

    @Test
    void shouldThrowExceptionForInvalidQuantity() {
        Order order = new Order();
        order.setQuantity(0);

        assertThrows(IllegalArgumentException.class,
                () -> service.createOrder(order));
    }
}