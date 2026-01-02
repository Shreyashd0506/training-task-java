package com.task5.encapsulation;

public class Student {


 private String name;
 private int age;
 private int grade;

 
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 // Setter for age (with validation)
 public void setAge(int age) {
     if (age > 3) {      
         this.age = age;
     } else {
         System.out.println("Age must be greater than 3.");
     }
 }

 public int getGrade() {
     return grade;
 }

 // Setter for grade (validation)
 public void setGrade(int grade) {
     if (grade >= 1 && grade <= 12) {
         this.grade = grade;
     } else {
         System.out.println("Invalid grade! Enter between 1 to 12.");
     }
 }
}
