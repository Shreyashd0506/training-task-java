package InheritanceAndPloymorphism;

public class InheritanceDemo {


    // FINAL VARIABLE
    static final String COUNTRY = "India";

    public static void main(String[] args) {

        System.out.println("Country: " + COUNTRY);
        System.out.println("----- SINGLE INHERITANCE -----");
        Dog dog = new Dog();
        dog.showType();
        dog.sound();

        System.out.println("\n----- MULTILEVEL INHERITANCE -----");
        Manager manager = new Manager();
        manager.role();
        manager.job();
        manager.manage();

        System.out.println("\n----- HIERARCHICAL INHERITANCE -----");
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        System.out.println("\n----- INTERFACE (MULTIPLE INHERITANCE) -----");
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.camera();
        phone.internet();
    }
}


   // SINGLE INHERITANCE
class Animal {

    String type = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

   public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    String type = "Dog";

    Dog() {
        super(); // parent constructor
        System.out.println("Dog constructor called");
    }

 public void showType() {
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + this.type);
    }

    @Override
   public void sound() {
        super.sound(); // parent method
        System.out.println("Dog barks");
    }
}

//MULTILEVEL INHERITANCE
class Person {
    void role() {
        System.out.println("Person exists");
    }
}

class Employee extends Person {
    void job() {
        System.out.println("Employee works");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages team");
    }
}


//HIERARCHICAL INHERITANCE
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape { }

class Rectangle extends Shape { }


//FINAL METHOD
class Bank {

    final void interestRate() {
        System.out.println("Fixed interest rate: 7%");
    }
}

class SBI extends Bank {
    // Cannot override interestRate() because it is final
}


//MULTIPLE INHERITANCE USING INTERFACE
interface Phone {
    void call();
}

interface Camera {
    void camera();
}

interface Internet {
    void internet();
}

class SmartPhone implements Phone, Camera, Internet {

    public void call() {
        System.out.println("Calling...");
    }

    public void camera() {
        System.out.println("Taking photo...");
    }

    public void internet() {
        System.out.println("Browsing internet...");
    }
}