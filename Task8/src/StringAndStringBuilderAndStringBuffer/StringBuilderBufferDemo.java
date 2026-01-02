package StringAndStringBuilderAndStringBuffer;

public class StringBuilderBufferDemo {

    public static void main(String[] args) {

        //  StringBuilder (Fast, Not Thread-Safe)
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        System.out.println("After append: " + sb);

        sb.insert(5, "Core ");
        System.out.println("After insert: " + sb);

        sb.delete(5, 10); // deletes "Core "
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("StringBuilder capacity: " + sb.capacity());

        System.out.println("--------------------------------");

        //  StringBuffer (Thread-Safe, Slower)
        StringBuffer sbf = new StringBuffer("Hello");

        sbf.append(" World");
        System.out.println("After append: " + sbf);

        sbf.insert(6, "Java ");
        System.out.println("After insert: " + sbf);

        sbf.delete(6, 11); // deletes "Java "
        System.out.println("After delete: " + sbf);

        sbf.reverse();
        System.out.println("After reverse: " + sbf);

        System.out.println("StringBuffer capacity: " + sbf.capacity());
    }
}
