package BasicConcepts;


class Student {

    // Stored in METHOD AREA
    int id;          // instance variable (Heap)
    String name;     // reference stored in Heap, object in Heap

    // Constructor → Method Area
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method → Method Area
    void display() {
        System.out.println(id + " " + name);
    }

    // finalize() called by GC before object destruction
    @Override
    protected void finalize() {
        System.out.println("Student object is garbage collected");
    }
}


public class ConceptsDemo {

    // Stored in METHOD AREA
    static int staticValue = 100;  // static variable → Method Area

    public static void main(String[] args) {

        /*
        1. CLASS LOADER
        - JVM loads JVMConceptDemo.class and Student.class
        - Bootstrap → Extension → Application ClassLoader
        */

        System.out.println("Class Loader Demo:");
        System.out.println(ConceptsDemo.class.getClassLoader());
        System.out.println(Student.class.getClassLoader());

        /*
        2. RUNTIME CONSTANT POOL
        - String literals are stored here
        - Part of Method Area
        */

        String s1 = "Java";   // stored in String Constant Pool
        String s2 = "Java";   // points to same object

        System.out.println("\nRuntime Constant Pool Demo:");
        System.out.println(s1 == s2); // true (same reference)

        /*
        3. STACK MEMORY
        - Method calls
        - Local variables
        - Each thread has its own stack
        */

        int a = 10;   // stored in Stack
        int b = 20;   // stored in Stack
        int sum = a + b;

        System.out.println("\nStack Memory Demo:");
        System.out.println("Sum = " + sum);

        /*
        4. HEAP MEMORY
        - Objects and instance variables
        */

        Student st1 = new Student(1, "Rahul"); // object created in Heap
        Student st2 = new Student(2, "Amit");

        System.out.println("\nHeap Memory Demo:");
        st1.display();
        st2.display();

        /*
        5. OBJECT CREATION LIFE CYCLE
        1. Class loaded
        2. Memory allocated in Heap
        3. Constructor called
        4. Object used
        5. Object eligible for GC
        */

        st1 = null;  // object becomes eligible for GC
        st2 = null;

        /*
        6. GARBAGE COLLECTION
        - JVM automatically removes unused objects
        - finalize() may be called
        */

        System.out.println("\nRequesting Garbage Collection...");
        System.gc();   // Request GC (not guaranteed)

        /*
        7. METHOD AREA
        - Stores:
          • Class metadata
          • Static variables
          • Method bytecode
          • Runtime Constant Pool
        */

        System.out.println("\nMethod Area Demo:");
        System.out.println("Static value = " + staticValue);

        System.out.println("\nProgram Ended");
    }
}