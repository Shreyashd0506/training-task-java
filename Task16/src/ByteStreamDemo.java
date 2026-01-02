import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

    public static void main(String[] args) {

        try {

            //  Writing data using FileOutputStream
            FileOutputStream fos = new FileOutputStream("source.txt");

            String data = "Hello! This is Byte Stream Example.";

            // Convert string to bytes and write to file
            fos.write(data.getBytes());

            System.out.println("Data written to source.txt successfully.");

            fos.close(); // Always close the stream


            //  Reading data using FileInputStream
            FileInputStream fis = new FileInputStream("source.txt");

            System.out.println("\nReading data from source.txt:");

            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();


            //  Copying file using byte stream
            FileInputStream input = new FileInputStream("source.txt");
            FileOutputStream output = new FileOutputStream("copy.txt");

            int dataByte;
            while ((dataByte = input.read()) != -1) {
                output.write(dataByte);
            }

            input.close();
            output.close();

            System.out.println("\n\nFile copied successfully to copy.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}