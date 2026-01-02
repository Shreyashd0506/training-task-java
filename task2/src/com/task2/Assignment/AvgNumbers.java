package com.task2.Assignment;

import java.util.Scanner;

public class AvgNumbers {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int sum = 0;
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter Number "+ i + ": ");
			sum = sum +scanner.nextInt();
		}
		
		double avg=sum/5.0;
		System.out.println("Average = "+avg);
	}

}
