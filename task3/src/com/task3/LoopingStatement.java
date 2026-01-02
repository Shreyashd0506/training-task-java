package com.task3;

public class LoopingStatement {


    public static void main(String[] args) {

        
        System.out.println("Counting students using For loop:");
        for (int roll = 1; roll <= 10; roll++) {
            if (roll == 5) continue;
            System.out.println("Present Student Roll No:" + roll);
        }
     
        System.out.println("Searching a student using While:");
        String[] names = {"Rahul", "Amit", "Sneha", "Riya", "Ajay"};
        int i = 0;
        while (i < names.length) {
            if (names[i].equals("Sneha")) {
                System.out.println("Student Sneha Found");
                break; 
            }
            i++;
        }

        System.out.println("Daily Attendance Do-While:");
        int day = 1;
        do {
            System.out.println("Taking attendance for Day:" + day);
            day++;
        } while (day <= 3);

        System.out.println("Student marks:");
        int[] marks = {85, 90, 78, 92};
        for (int m : marks) {
            System.out.println("Marks:" + m);
        }
        System.out.println("Average Marks=" + getAverageMarks());
    }

    public static int getAverageMarks() {
        int[] marks = {85, 90, 78, 92};
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / marks.length;
    }
}