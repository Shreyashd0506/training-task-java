package UnchekedException;

public class UncheckedExceptionDemo {

    public static void arithmeticExample() {
        int a = 10, b = 0;
        System.out.println(a / b); // ArithmeticException
    }

    public static void nullPointerExample() {
        String name = null;
        System.out.println(name.length()); // NullPointerException
    }

    public static void arrayIndexExample() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }

    public static void numberFormatExample() {
        String value = "abc";
        int num = Integer.parseInt(value); // NumberFormatException
    }

    public static void classCastExample() {
        Object obj = "Hello";
        Integer i = (Integer) obj; // ClassCastException
    }

    public static void main(String[] args) {

        try {
            arithmeticExample();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        }


        try{
            nullPointerExample();
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }


        try{
            arrayIndexExample();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }

        try{
            numberFormatExample();
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        }

        try{
            classCastExample();
        }
        catch (ClassCastException e) {
            System.out.println("ClassCastException handled");
        }


        finally {
            System.out.println("Finally block executed");
        }
    }
}
