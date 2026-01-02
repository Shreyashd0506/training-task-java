import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {

        try {

            //  Create a directory
            File directory = new File("MyFolder");

            if (!directory.exists()) {
                directory.mkdir();  // creates folder
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Directory already exists.");
            }

            //  Create a file inside directory
            File file = new File(directory, "sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            //  Check file properties
            System.out.println("\n--- File Details ---");
            System.out.println("File Name      : " + file.getName());
            System.out.println("File Path      : " + file.getAbsolutePath());
            System.out.println("File Exists    : " + file.exists());
            System.out.println("File Size      : " + file.length() + " bytes");

            // File permissions
            System.out.println("Readable       : " + file.canRead());
            System.out.println("Writable       : " + file.canWrite());
            System.out.println("Executable     : " + file.canExecute());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}