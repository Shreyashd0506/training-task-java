package com.task5;

//ENCAPSULATION (Guest class)
public class Guest {
 private String name;
 private String phone;

 public Guest(String name, String phone) {
     this.name = name;
     this.phone = phone;
 }

 public String getName() { return name; }
 public String getPhone() { return phone; }
}

// INHERITANCE (Base Room class)
class Room {
 protected int roomNumber;

 public Room(int roomNumber) {
     this.roomNumber = roomNumber;
 }

 void showRoomInfo() {
     System.out.println("Room Number: " + roomNumber);
 }

 // POLYMORPHISM (overridden by child classes)
 double calculatePrice() {
     return 0;
 }
}

//CHILD CLASSES (Inheritance + Polymorphism)
class StandardRoom extends Room {
 public StandardRoom(int roomNumber) {
     super(roomNumber);
 }

 @Override
 double calculatePrice() {
     return 1500;  // ₹1500 per night
 }
}

class DeluxeRoom extends Room {
 public DeluxeRoom(int roomNumber) {
     super(roomNumber);
 }

 @Override
 double calculatePrice() {
     return 3000;  // ₹3000 per night
 }
}


// ABSTRACTION (Payment)
abstract class Payment {
 abstract void pay(double amount); // hiding real logic
}

class UpiPayment extends Payment {
 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI.");
 }
}
