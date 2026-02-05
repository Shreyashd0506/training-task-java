package com.example.performance_lab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue
   private Long id;

    private String city;

    @ManyToOne
    private Customer customer;



}
