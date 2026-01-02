package InheritanceAndPloymorphism;
public class CastingExample {

    public static void main(String[] args) {


        // UPCASTING
        Employeee emp = new Developer();
        emp.work();    // Developers


        // DOWN CASTING
        Developer dev = (Developer) emp;
        dev.code();
    }
}

  // Parent class
class Employeee {

  public void work() {
        System.out.println("Employee is working");
    }
}


   //Child class
class Developer extends Employeee {

    @Override
    public void work() {
        System.out.println("Developer is writing code");
    }

    public void code() {
        System.out.println("Developer writes Java code");
    }
}