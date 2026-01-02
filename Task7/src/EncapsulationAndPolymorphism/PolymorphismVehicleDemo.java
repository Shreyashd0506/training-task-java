package EncapsulationAndPolymorphism;

public class PolymorphismVehicleDemo {

    public static void main(String[] args) {

         // Overloading
        ServiceCenter center = new ServiceCenter();
        center.service("Bike");
        center.service("Car", 2);
        center.service("Truck", true);

        //  Upcasting
        Vehicle vehicle = new Car();   // Upcasting
        Engine engine = vehicle.getEngine(); // Runtime polymorphism
        engine.engineType();

        // Downcasting
        if (vehicle instanceof Car) {
            Car car = (Car) vehicle;  // Downcasting
            car.openSunroof();
        }
    }
}

// Method Overloading
class ServiceCenter {

    void service(String vehicleType) {
        System.out.println("Servicing " + vehicleType);
    }

    void service(String vehicleType, int wheels) {
        System.out.println("Servicing " + vehicleType + " with " + wheels + " wheels");
    }

    void service(String vehicleType, boolean heavyVehicle) {
        System.out.println(
                heavyVehicle ? "Servicing heavy " + vehicleType : "Servicing light " + vehicleType
        );
    }
}

// Parent Class
class Vehicle {

    Engine getEngine() {
        System.out.println("Getting generic engine");
        return new Engine();
    }
}

//  Child Class
class Car extends Vehicle {

    // Covariant return type (Engine → PetrolEngine)
    @Override
    PetrolEngine getEngine() {
        System.out.println("Getting car petrol engine");
        return new PetrolEngine();
    }

    void openSunroof() {
        System.out.println("Sunroof opened");
    }
}

//Base Return Type
class Engine {
    void engineType() {
        System.out.println("Generic engine");
    }
}

// Child Return Type
class PetrolEngine extends Engine {

    @Override
    void engineType() {
        System.out.println("Petrol engine");
    }
}