package com.task5.inheritence;

//SINGLE INHERITANCE
class Vehicle {
 void start() {
     System.out.println("Vehicle starts...");
 }
}

class Car extends Vehicle {
 void playMusic() {
     System.out.println("Car music playing...");
 }
}


// MULTILEVEL INHERITANCE 
class Car2 extends Vehicle {   // parent
 void openDoor() {
     System.out.println("Car door opened.");
 }
}

class SportsCar extends Car2 {   // child
 void turboMode() {
     System.out.println("Turbo Mode Activated!");
 }
}


//HIERARCHICAL INHERITANCE 

class Car3 extends Vehicle {
 void carFeature() {
     System.out.println("Car AC ON.");
 }
}

class Bike extends Vehicle {
 void bikeFeature() {
     System.out.println("Bike kick-started.");
 }
}

class Truck extends Vehicle {
 void truckFeature() {
     System.out.println("Truck carrying heavy load.");
 }
}

//MULTIPLE INHERITANCE ( INTERFACES) 
interface Engine {
 void startEngine();
}

interface MusicSystem {
 void playSound();
}

class CarMulti implements Engine, MusicSystem {
 public void startEngine() {
     System.out.println("Engine started using interface.");
 }

 public void playSound() {
     System.out.println("Music system playing via interface.");
 }
}


//HYBRID INHERITANCE (Interfaces)
interface Safety {
 void airbag();
}

interface Entertainment {
 void playMusic();
}

class HybridCar extends Vehicle implements Safety, Entertainment {

 public void airbag() {
     System.out.println("Airbag activated (Safety).");
 }

 public void playMusic() {
     System.out.println("Music playing (Entertainment).");
 }
}

