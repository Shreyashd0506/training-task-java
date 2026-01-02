package Arrays;

import java.util.ArrayList;

public class ArrayVsArrayList {

    public static void main(String[] args) {


        //  Array Example
        int[] array = new int[3];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        System.out.println("Array values:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


        //  ArrayList Example
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40); // dynamic size

        System.out.println("\n\nArrayList values:");
        for (int value : list) {
            System.out.print(value + " ");
        }


        // Removing element
        list.remove(1); // removes element at index 1
        System.out.println("\n\nAfter removing index 1 from ArrayList:");
        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}