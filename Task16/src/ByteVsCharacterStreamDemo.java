import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteVsCharacterStreamDemo {

    public static void main(String[] args) {

        try {

            String text = "Hello Java \nWelcome to Character Stream!";

            // 1. Write using Byte Stream
            FileOutputStream byteStream =
                    new FileOutputStream("byteStream.txt");

            byteStream.write(text.getBytes()); // converts text to bytes
            byteStream.close();

            System.out.println("Data written using Byte Stream");


            // 2. Write using Character Stream
            FileWriter charStream =
                    new FileWriter("charStream.txt");

            charStream.write(text); // writes characters directly
            charStream.close();

            System.out.println("Data written using Character Stream");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}