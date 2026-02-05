package com.example.performance_lab.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "customer",
    fetch = FetchType.LAZY)
    private List<Address> addresses;
}
