package com.task4;


public class Manager extends Employee {

private String department;   

// Default Manager constructor 
Manager() {
   super(); 
   System.out.println("Manager: Default constructor");
   this.department = "Unknown Department";
}

// Parameterized constructor
Manager(String name, int id, double salary, String department) {
   super(name, id, salary);     
   this.department = department;
}

// public method								
public void showManagerInfo() {
   super.showDetails(); 
   System.out.println("Department: " + this.department);
}
}