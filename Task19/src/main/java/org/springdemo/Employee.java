package org.springdemo;

public class Employee {

    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor called");
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("City: " + address.getCity());
    }

    public void init() {
        System.out.println("Bean Initialized");
    }

    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}