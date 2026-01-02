package StringAndStringBuilderAndStringBuffer;

public class StringMethodsDemo {

    public static void main(String[] args) {

        String text = "Java Programming Language";

        //  charAt()
        System.out.println("charAt(2): " + text.charAt(1));

        //  length()
        System.out.println("Length: " + text.length());

        //  substring()
        String sub = text.substring(2, 6);
        System.out.println("Substring(2,6): " + sub);

        //  indexOf() & lastIndexOf()
        System.out.println("indexOf('a'): " + text.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + text.lastIndexOf('a'));

        //  equals() vs equalsIgnoreCase()
        String s1 = "Java";
        String s2 = "java";

        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("equalsIgnoreCase(): " + s1.equalsIgnoreCase(s2));

        //  toUpperCase() & toLowerCase()
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        //   trim()
        String trimmed = text.trim();
        System.out.println("Trimmed text: '" + trimmed + "'");

        //  replace()
        String replaced = trimmed.replace("Java", "Core Java");
        System.out.println("Replaced text: " + replaced);

        //  split()
        String sentence = "Java is simple and powerful";
        String[] words = sentence.split(" ");

        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // concat() and immutability
        String original = "Hello";
        original.concat(" World"); // not assigned

        System.out.println("After concat without assignment: " + original);

        original = original.concat(" World");
        System.out.println("After concat with assignment: " + original);
    }
}
