package InheritanceAndPloymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {

        System.out.println("---- COMPILE TIME POLYMORPHISM ----");
        Calculator calc = new Calculator();
        calc.add(10, 20);
        calc.add(10, 20, 30);

        System.out.println("\n---- RUN TIME POLYMORPHISM ----");
        Vehicle v;

        v = new Car();     // parent reference = child object
        v.start();

        v = new Bike();
        v.start();
    }
}


   // COMPILE TIME POLYMORPHISM (Method Overloading)
class Calculator {

    public void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }
}


   //RUN TIME POLYMORPHISM (Method Overriding)
class Vehicle {

   public void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

