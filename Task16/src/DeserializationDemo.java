import java.io.*;

// Serializable class
class Student implements Serializable {

    int id;
    String name;

    // transient variable (will not be restored)
    transient String password;

    Student(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    void display() {
        System.out.println("ID       : " + id);
        System.out.println("Name     : " + name);
        System.out.println("Password : " + password);
    }
}

public class DeserializationDemo {

    public static void main(String[] args) {

        try {

            // Deserialization Process
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();
            fis.close();

            // Verify Restored Object
            System.out.println("Object Deserialized Successfully\n");
            s.display();

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}