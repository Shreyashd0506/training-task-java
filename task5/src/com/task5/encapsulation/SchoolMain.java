package com.task5.encapsulation;

public class SchoolMain {
public static void main(String[] args) {

   Student s = new Student();

  
   s.setName("Rahul");
   s.setAge(10);
   s.setGrade(5);
   
   System.out.println("Student Name : " + s.getName());
   System.out.println("Age          : " + s.getAge());
   System.out.println("Grade        : " + s.getGrade());
}
}
