package com.task2;

public class LoopingState {
      
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int j=1;
		while(j<=100) {
			System.out.print(j + " ");
			j++;
		}
		
		System.out.println();
		
		int k=1;
		do {
			System.out.print(k +" ");
			k++;
		}while(k<=100);
		
		
	}
}
