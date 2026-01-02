package com.task3;

public class ConditionalStatement {
	
    public static void main(String[] args) {

        int marks = 75;

        if (marks > 70) {
            System.out.println("If:You passed with good marks!");
        }

        if (marks >= 40) {
            System.out.println("If-Else:You are Pass");
        } else {
            System.out.println("If-Else:You are Fail");
        }

        if (marks >= 40) {
            if (marks >= 90) {
                System.out.println("Nested If:Grade A+");
            } else {
                System.out.println("Nested If:Grade A or B");
            }
        }

        int day = 3;

        switch (day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown day";
        };
        System.out.println(result);

        String message = switch (day) {
            case 1 -> { yield "First day of week"; }
            case 2 -> { yield "Second day of week"; }
            default -> { yield "Some other day"; }
        };
        System.out.println(message);
    }
}