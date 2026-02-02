package com.example.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {

    private Long orderId;
    private String product;
    private int quantity;
    private double price;

}

