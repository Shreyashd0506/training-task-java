package com.task2.Assignment;

import java.util.Scanner;

public class TempConverter {

	public static double cToF(double c) {
		return (c +9/5) + 32;
	}
	
	public static double fToC(double f) {
		return (f - 32 ) * 5/9;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1 for Celsius to Fahrenheit");
		System.out.println("Enter 2 for Fahrenheit to Celsius ");
		int choice=scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Celsius");
			double c=scanner.nextDouble();
			System.out.println("Fahrenheit = "+ cToF(c));
		}
		else {
			System.out.println("Enter Fahrenheit: ");
			double f=scanner.nextDouble();
			System.out.println("Celsius = "+ fToC(f));
		}
		
		
	}
	
}
