package com.task4;


public class Employee {

 protected String name;      
 protected int id;
 private double salary;      

 // Default constructor
 Employee() {
     System.out.println("Employee: Default constructor");
     this.name = "ABC";
     this.id = 0;
     this.salary = 0.0;
 }

 // Parameterized constructor
 Employee(String name, int id, double salary) {
     System.out.println("Employee: Parameterized constructor");
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 protected void showDetails() {  
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + id);
     System.out.println("Salary: " + salary);
 }
}


