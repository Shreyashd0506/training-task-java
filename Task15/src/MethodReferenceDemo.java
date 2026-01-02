import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        // 1. Static Method Reference
        System.out.println("Static Method Reference");

        // Lambda way
        Function<Integer, Integer> squareLambda = n -> square(n);

        // Method reference way
        Function<Integer, Integer> squareMethodRef = MethodReferenceDemo::square;

        System.out.println("Square using lambda: " + squareLambda.apply(5));
        System.out.println("Square using method reference: " + squareMethodRef.apply(5));


        // 2. Instance Method Reference
        System.out.println("\n Instance Method Reference");

        MethodReferenceDemo obj = new MethodReferenceDemo();

        // Lambda way
        Consumer<String> lambdaPrinter = msg -> obj.printMessage(msg);

        // Method reference way
        Consumer<String> methodRefPrinter = obj::printMessage;

        lambdaPrinter.accept("Hello using Lambda");
        methodRefPrinter.accept("Hello using Method Reference");


        // 3. Constructor Reference
        System.out.println("\n Constructor Reference");

        // Lambda way
        Supplier<Student> studentLambda = () -> new Student();

        // Constructor reference way
        Supplier<Student> studentMethodRef = Student::new;

        studentLambda.get();
        studentMethodRef.get();
    }

    // Static method
    static int square(int num) {
        return num * num;
    }

    // Instance method
    void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

// Simple class for constructor reference
class Student {
    Student() {
        System.out.println("Student object created!");
    }
}