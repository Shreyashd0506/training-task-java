package com.example.Task32.controller;

import com.example.Task32.model.Order;
import com.example.Task32.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(OrderController.class)
class OrderControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private OrderService service;

    @Test
    void shouldCreateOrder() throws Exception {

        when(service.createOrder(any()))
                .thenReturn(new Order());

        mockMvc.perform(post("/orders")
                        .contentType("application/json")
                        .content("""
                  {"productName":"Laptop","price":50000,"quantity":1}
                """))
                .andExpect(status().isOk());
    }
}
