package com.example.performance_lab.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders",
          indexes = @Index(name = "idx_order_amount",
          columnList = "amount"))
@Data
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;

    @ManyToOne
    private User user;
}
