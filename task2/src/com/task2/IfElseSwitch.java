package com.task2;

public class IfElseSwitch {

	
	public static void main(String[] args) {
		
		int marks=75;
		
		if(marks >= 60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		int day = 2;
		
		switch(day) {
		case 1 : 
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		default :
			System.out.println("Otherday");
		}
		
			
	}
	
}
