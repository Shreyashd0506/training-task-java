import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {

    public static void main(String[] args) {

        try {

            //  Writing text using FileWriter
            FileWriter writer = new FileWriter("textfile.txt");

            writer.write("Hello World!\n");
            writer.write("This file is written using Character Stream.\n");
            writer.write("Character streams support Unicode.");

            writer.close(); // Always close the stream

            System.out.println("Text written to file successfully.\n");


            //  Reading text using FileReader
            FileReader reader = new FileReader("textfile.txt");

            System.out.println("Reading data from file:");

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();


            //  Explanation Output
            System.out.println("\n\n--- Comparison ---");
            System.out.println("Character Stream:");
            System.out.println("- Works with characters");
            System.out.println("- Supports Unicode");
            System.out.println("- Used for text files");

            System.out.println("\nByte Stream:");
            System.out.println("- Works with raw bytes");
            System.out.println("- Used for images, audio, video");
            System.out.println("- Does not support Unicode properly");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}