package com.task2.Assignment;

import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1 Add");
            System.out.println("2 Subtract");
            System.out.println("3 Multiply");
            System.out.println("4 Divide");
            System.out.println("0 Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            if (choice == 0){
                System.out.println("Bye!");
                break;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            switch (choice){
                case 1 :
                	System.out.println("Result = " + (a + b));
                	break;
                case 2 :
                	System.out.println("Result = " + (a - b));
                	break;
                case 3 :
                	System.out.println("Result = " + (a * b));
                	break;
                	
                case 4 :
                	System.out.println("Result = " + (a / b));
                	break;
                default :
                	System.out.println("Invalid choice");
                	break;
            }
        }
        while(true);
    }
}