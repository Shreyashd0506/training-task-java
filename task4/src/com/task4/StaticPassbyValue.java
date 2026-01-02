package com.task4;

public class StaticPassbyValue {

    // STATIC PART 
    static int count;   

    static {            
        System.out.println("Static Block Executed!");
        count = 10;
    }

    static void showCount() {   
        System.out.println("Static Count = " + count);
    }

    //PASS-BY-VALUE PART
   public void changePrimitive(int x) {
        x = x + 5; 
        System.out.println("Inside changePrimitive x = " + x);
    }

   public void changeObject(Student s) {
        s.age = 20; 
        System.out.println("Inside changeObject age = " + s.age);
        
        // Reassigning object reference 
        s = new Student("Aditya", 23);
        System.out.println("Inside changeObject after reassignment: " + s.name);
    }


    public static void main(String[] args) {

        StaticPassbyValue d = new StaticPassbyValue();

        // PASS-BY-VALUE (Primitive)
        int num = 10;
        d.changePrimitive(num);
        System.out.println("After method call (primitive), num = " + num);

        //PASS-BY-VALUE (Object Reference)
        Student st = new Student("Rahul", 15);
        d.changeObject(st);
        System.out.println("After method call, Student age = " + st.age);
        System.out.println("Student name still = " + st.name);

        // STATIC USAGE
        StaticPassbyValue.showCount();  
        StaticPassbyValue.count = 50;  
        StaticPassbyValue.showCount();
    }
}

