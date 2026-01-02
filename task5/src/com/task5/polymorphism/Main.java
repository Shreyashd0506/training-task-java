package com.task5.polymorphism;

public class Main {
    public static void main(String[] args) {
 
        Vehicle v;
 
        v = new Car();   
        v.start();       
 
        v = new Bike();  
        v.start();       
    }
}

