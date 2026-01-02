package com.task5;

public class HotelMain {
	 public static void main(String[] args) {

	     // Encapsulation → Guest object
	     Guest g = new Guest("Rahul", "9876543210");
	     System.out.println("Guest: " + g.getName() + " | Phone: " + g.getPhone());

	     // Inheritance + Polymorphism
	     Room room1 = new StandardRoom(101);
	     Room room2 = new DeluxeRoom(202);

	     System.out.println("\n--- Booking Details ---");
	     room1.showRoomInfo();
	     System.out.println("Room Price: " + room1.calculatePrice());

	     room2.showRoomInfo();
	     System.out.println("Room Price: " + room2.calculatePrice());

	     // Abstraction → Payment
	     Payment payment = new UpiPayment();
	     payment.pay(room2.calculatePrice());
	 }
	}