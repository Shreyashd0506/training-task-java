import java.util.function.*;


// 1. Custom Functional Interface
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceDemo {


    public static void main(String[] args) {

        // 2. Implement custom functional interface using lambda
        System.out.println("Custom Functional Interface:");

        Calculator addition = (a, b) -> a + b;
        Calculator multiplication = (a, b) -> a * b;

        performOperation(10, 5, addition);
        performOperation(10, 5, multiplication);


        // Built-in Functional Interfaces
        System.out.println("\nBuilt-in Functional Interfaces:");

        // Predicate → returns boolean
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // Function → takes input, returns output
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'Java' = " + stringLength.apply("Java"));

        // Consumer → takes input, no return
        Consumer<String> printer = msg -> System.out.println("Message: " + msg);
        printer.accept("Hello from Consumer");

        // Supplier → returns value, no input
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());
    }

    // 3. Method that accepts functional interface
    static void performOperation(int x, int y, Calculator calc) {
        int result = calc.calculate(x, y);
        System.out.println("Result = " + result);
    }
}