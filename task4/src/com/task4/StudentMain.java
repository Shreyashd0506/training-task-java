package com.task4;

public class StudentMain {

   
    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

   public double add(double a, double b) {
        return a + b;
    }

    public void printStudent(Student s) {
        System.out.println("Student Name: " + s.name);
        System.out.println("Student Age: " + s.age);
    }

    public static void main(String[] args) {

        StudentMain s1 = new StudentMain();


        System.out.println(s1.add(10, 20));         
        System.out.println(s1.add(10, 20, 30));     
        System.out.println(s1.add(10.5, 20.7));   

    
        Student st = new Student("Rahul", 16);
        s1.printStudent(st);
    }
}

