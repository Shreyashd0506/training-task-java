import java.io.*;

// Serializable class
class Students implements Serializable {

    int id;
    String name;

    // transient variable (will NOT be serialized)
    transient String password;

    Students(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Password: " + password);
    }
}

public class SerializationDemo {

    public static void main(String[] args) {

        try {

            // 1. Serialization (Object → File)
            Students s1 = new Students(101, "Rahul", "rahul123");

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Object serialized successfully.\n");


            // 2. Deserialization (File → Object)
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Students s2 = (Students) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Object deserialized successfully:");
            s2.display();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}