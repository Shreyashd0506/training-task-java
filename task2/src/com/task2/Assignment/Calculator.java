package com.task2.Assignment;

import java.util.Scanner;

public class Calculator {
  
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		double a=scanner.nextDouble();
		
		System.out.println("Enter Second Number: ");
		double b=scanner.nextDouble();
		
		System.out.println("Enter The Operator ( + , - , * , / ): ");
		
		char op =scanner.next().charAt(0);
		
		double result = 0;
		
		if(op == '+') {
			result=a+b;
		}
		else if(op == '-') {
			result=a-b;
		}
		else if(op == '*') {
			result=a*b;
		}
		else if(op == '/') {
			result=a/b;
		}
		else {
			System.out.println("Invalid Operator");
		}
		System.out.println("Result = " + result);
	}
}
