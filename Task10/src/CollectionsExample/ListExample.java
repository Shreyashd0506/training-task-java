package CollectionsExample;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        // ARRAYLIST
        System.out.println("---- Student List (ArrayList) ----");

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Amit"));
        students.add(new Student(2, "Rohit"));
        students.add(new Student(3, "Sneha"));

        for (Student s : students) {
            s.display();
        }

        // VECTOR
        System.out.println("\n---- College Notice Board (Vector) ----");

        Vector<String> notices = new Vector<>();
        notices.add("Exam on Monday");
        notices.add("Holiday on Friday");
        notices.add("Fees deadline tomorrow");

        for (String notice : notices) {
            System.out.println(notice);
        }

        // STACK
        System.out.println("\n---- Undo Operations (Stack) ----");

        Stack<String> actions = new Stack<>();
        actions.push("Login");
        actions.push("Update Profile");
        actions.push("Submit Form");

        System.out.println("Last Action Removed: " + actions.pop());
        System.out.println("Current Action: " + actions.peek());

        // LINKEDLIST
        System.out.println("\n---- College Bus Stops (LinkedList) ----");

        LinkedList<String> busStops = new LinkedList<>();
        busStops.add("College");
        busStops.add("City Center");
        busStops.add("Railway Station");

        busStops.addFirst("Bus Depot");
        busStops.addLast("Airport");

        for (String stop : busStops) {
            System.out.println(stop);
        }
    }
}

class Student{
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(id+"-"+name);
    }
}