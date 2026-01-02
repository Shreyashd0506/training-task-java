package Arrays;

import java.util.Arrays;

public class SalaryArrayExample {

    public static void main(String[] args) {

        // Salary array of employees
        int[] salaries = {25000, 30000, 28000, 40000, 35000};


        // Display Salaries
        System.out.println("Original Salaries:");
        printArray(salaries);


        // Searching (Find salary)
        int searchSalary = 30000;
        boolean found = false;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] == searchSalary) {
                System.out.println("\nSalary " + searchSalary +
                        " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSalary not found");
        }


        // Sorting Salaries
        Arrays.sort(salaries);
        System.out.println("\nSorted Salaries:");
        printArray(salaries);


        // Updating Salary (Increment)
        salaries[2] = salaries[2] + 5000; // increment salary
        System.out.println("\nAfter Salary Increment:");
        printArray(salaries);


        // Copying Salaries
        int[] salaryBackup = Arrays.copyOf(salaries, salaries.length);

        System.out.println("\nCopied Salary Array:");
        printArray(salaryBackup);
    }

    // Method to print array
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
