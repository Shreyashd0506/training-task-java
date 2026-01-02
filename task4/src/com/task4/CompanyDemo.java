package com.task4;

public class CompanyDemo {

public static void main(String[] args) {


   Manager m1 = new Manager();
   m1.showManagerInfo();

   System.out.println("-------------------------------");

   Manager m2 = new Manager("Rohit Sharma", 102, 75000.50, "IT Department");
   m2.showManagerInfo();
}
}