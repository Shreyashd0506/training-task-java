import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {

    public static void main(String[] args) {

        // 1. Filter Even Numbers using Stream
        System.out.println("1) Filter Even Numbers");

        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);


         // stream() → converts collection into stream
         //filter() → applies condition (only even numbers)
         //collect() → converts stream back to list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) // keep even numbers
                .collect(Collectors.toList());

        // Print result
        System.out.println("Even Numbers: " + evenNumbers);


        // 2. Convert List of Names to Uppercase
        System.out.println("\n2) Convert Names to Uppercase");

        // List of names
        List<String> names = Arrays.asList("rahul", "amit", "neha", "pooja");


         // map() → transforms each element
         // toUpperCase() → converts string to uppercase
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        // Print uppercase names
        System.out.println("Uppercase Names: " + upperNames);


        // 3. Find Maximum Number using Stream
        System.out.println("\n3) Find Maximum Number");

        // List of marks
        List<Integer> marks = Arrays.asList(78, 45, 89, 92, 67);


         // max() → finds maximum value
          //Integer::compareTo → method reference for comparison
         // get() → retrieves value from Optional
        int max = marks.stream()
                .max(Integer::compareTo)
                .get();

        // Print maximum value
        System.out.println("Maximum Number: " + max);
    }
}