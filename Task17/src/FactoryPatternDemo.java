
public class FactoryPatternDemo {

    public static void main(String[] args) {

        // Client does NOT know object creation logic
        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.drive();

        Vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.drive();
    }
}

// Step 1: Create Interface
interface Vehicle {
    void drive();
}

// Step 2: Create Implementations
class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

// Step 3: Factory Class
class VehicleFactory {

    // Factory method
    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("car")) {
            return new Car();
        }
        else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        }
        else {
            return null;
        }
    }
}

