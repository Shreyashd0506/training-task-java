import java.util.*;

public class ForEachDemo {

    public static void main(String[] args) {

        // 1. Iterate List using forEach()
        System.out.println("1) Iterate List using forEach");

        List<String> names = Arrays.asList("Rahul", "Amit", "Neha", "Pooja");

        /*
         * forEach() is a default method of Iterable
         * It takes a lambda expression
         */
        names.forEach(name -> System.out.println(name));


        // 2. Print Map Keys and Values using forEach()
        System.out.println("\n2) Iterate Map using forEach");

        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Rahul");
        studentMap.put(102, "Amit");
        studentMap.put(103, "Neha");

        /*
         * forEach() in Map takes BiConsumer
         * key -> key
         * value -> value
         */
        studentMap.forEach((key, value) -> {
            System.out.println("Roll No: " + key + ", Name: " + value);
        });
    }
}