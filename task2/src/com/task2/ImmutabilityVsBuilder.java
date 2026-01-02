package com.task2;

public class ImmutabilityVsBuilder {
	
	public static void main(String[] args) {
		
		String s1 = "Hello ";
		s1 = s1 + "World" ;
		
		System.out.println(s1);
		
		
		StringBuilder sb = new StringBuilder("Hello ");
		sb.append("World");
		
		System.out.println(sb);
	}

}
