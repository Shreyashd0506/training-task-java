
import java.util.*;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        // 1. Lambda to add two numbers
        System.out.println("Lambda to Add Two Numbers");

        // Functional interface using lambda
        AddNumbers add = (a, b) -> a + b;

        int result = add.add(10, 20);
        System.out.println("Sum = " + result);


        // 2. Sort a list of strings using Lambda
        System.out.println("\n Sorting List using Lambda");

        List<String> names = new ArrayList<>();
        names.add("Shreyash");
        names.add("Aditya");
        names.add("Aniket");
        names.add("Piyush");

        // Before sorting
        System.out.println("Before Sorting: " + names);

        // Lambda for sorting
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        // After sorting
        System.out.println("After Sorting: " + names);


        // 3. Lambda with Runnable (Multithreading)
        System.out.println("\n Lambda with Runnable");

        Runnable task = () -> {
            System.out.println("Thread is running using Lambda...");
        };

        Thread t = new Thread(task);
        t.start();
    }
}


// Functional Interface
interface AddNumbers {
    int add(int a, int b);
}