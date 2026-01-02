package StringAndStringBuilderAndStringBuffer;

public class StringDemo {

    public static void main(String[] args) {

        //  String Literal (Stored in String Pool)
        String s1 = "Java";
        String s2 = "Java";

        //  Using new keyword (Stored in Heap)
        String s3 = new String("Java");

        // Reference comparison
        System.out.println("s1 == s2 : " + (s1 == s2)); // true (same pool object)
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (heap vs pool)

        // Content comparison
        System.out.println("s1 equals s3 : " + s1.equals(s3)); // true

        //  Immutability check
        String s4 = "Hello";
        s4.concat(" World"); // does NOT change original string

        System.out.println("After concat without assignment: " + s4);

        // Assigning new reference
        s4 = s4.concat(" World");
        System.out.println("After concat with assignment: " + s4);
    }
}
