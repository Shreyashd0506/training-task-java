package Arrays;

public class ArrayExample {

    public static void main(String[] args) {


        // One-Dimensional Array
        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("1D Array (Marks):");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }


        //  Two-Dimensional Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //  Jagged Array
        int[][] jagged = new int[3][];

        jagged[0] = new int[]{10, 20};
        jagged[1] = new int[]{30, 40, 50};
        jagged[2] = new int[]{60};

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
