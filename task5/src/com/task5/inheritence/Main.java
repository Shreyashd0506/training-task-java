package com.task5.inheritence;

public class Main {

public static void main(String[] args) {

   System.out.println("---- SINGLE INHERITANCE ----");
   Car c = new Car();
   c.start();
   c.playMusic();

   System.out.println("\n---- MULTILEVEL INHERITANCE ----");
   SportsCar sc = new SportsCar();
   sc.start();
   sc.openDoor();
   sc.turboMode();

   System.out.println("\n---- HIERARCHICAL INHERITANCE ----");
   Car3 c3 = new Car3();
   Bike b = new Bike();
   Truck t = new Truck();
   
   c3.start();
   b.start();
   t.start();

   System.out.println("\n---- MULTIPLE INHERITANCE (INTERFACE) ----");
   CarMulti cm = new CarMulti();
   cm.startEngine();
   cm.playSound();

   System.out.println("\n---- HYBRID INHERITANCE ----");
   HybridCar hc = new HybridCar();
   hc.start();
   hc.airbag();
   hc.playMusic();
}
}
