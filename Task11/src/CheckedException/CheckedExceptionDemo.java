package CheckedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

    // Method using throws (checked exception)
   public static void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        System.out.println("File opened successfully");

    }

    public static void main(String[] args) {

        //  Checked Exception handled using try-catch
        try {
            FileInputStream file = new FileInputStream("abc.txt");
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found (Checked Exception)");
        }

        //  Checked Exception handled using throws
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException handled");
        }

    }
}
