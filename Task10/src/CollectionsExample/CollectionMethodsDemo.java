package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethodsDemo {

        public static void main(String[] args) {

            //  Create a list of student marks
            List<Integer> marks = new ArrayList<>();
            marks.add(75);
            marks.add(60);
            marks.add(90);
            marks.add(45);
            marks.add(82);

            System.out.println("Original Marks: " + marks);

            //  Sort the list
            Collections.sort(marks);
            System.out.println("Sorted Marks: " + marks);

            //  Reverse the list
            Collections.reverse(marks);
            System.out.println("Reversed Marks: " + marks);

            //  Shuffle the list (random order)
            Collections.shuffle(marks);
            System.out.println("Shuffled Marks: " + marks);

            //  Find minimum and maximum marks
            int minMarks = Collections.min(marks);
            int maxMarks = Collections.max(marks);

            System.out.println("Minimum Marks: " + minMarks);
            System.out.println("Maximum Marks: " + maxMarks);

            //  Create a synchronized (thread-safe) list
            List<Integer> safeMarks = Collections.synchronizedList(marks);

            // Access synchronized list safely
            synchronized (safeMarks) {
                System.out.println("Thread-safe Marks List: " + safeMarks);
            }
        }
    }

