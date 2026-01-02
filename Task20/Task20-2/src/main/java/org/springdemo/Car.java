package org.springdemo;

public class Car {

    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println(engine.start());
        System.out.println("Car is running...");
    }
}
