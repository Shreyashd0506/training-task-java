// Interface with default and static methods
interface Vehicle {

    // Abstract method (must be implemented)
    void start();

    // Default method (Java 8 feature)
    // Can be overridden by implementing class
    default void fuelType() {
        System.out.println("Vehicle uses Petrol or Diesel");
    }

    // Static method (cannot be overridden)
    // Called using interface name
    static void companyInfo() {
        System.out.println("Vehicle Company: ABC Motors");
    }
}

// Implementing the interface
class Bike implements Vehicle {

    // Implementing abstract method
    public void start() {
        System.out.println("Bike started using self-start");
    }

    // Overriding default method
    @Override
    public void fuelType() {
        System.out.println("Bike uses Petrol");
    }
}

// Main class
public class DefaultStaticInterfaceDemo {

    public static void main(String[] args) {

        // Creating object
        Vehicle bike = new Bike();

        // Calling abstract method
        bike.start();

        // Calling overridden default method
        bike.fuelType();

        // Calling static method of interface
        Vehicle.companyInfo();
    }
}