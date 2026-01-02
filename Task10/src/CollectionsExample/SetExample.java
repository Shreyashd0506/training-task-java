package CollectionsExample;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        //  SET (HashSet)
        System.out.println("---- HashSet (No Order) ----");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(105);
        hashSet.add(101);
        hashSet.add(103);
        hashSet.add(101); // duplicate ignored

        System.out.println(hashSet);

        //  LINKEDHASHSET
        System.out.println("\n---- LinkedHashSet (Insertion Order) ----");

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(105);
        linkedHashSet.add(101);
        linkedHashSet.add(103);
        linkedHashSet.add(101); // duplicate ignored

        System.out.println(linkedHashSet);

        //  TREESET
        System.out.println("\n---- TreeSet (Sorted Order) ----");

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(105);
        treeSet.add(101);
        treeSet.add(103);
        treeSet.add(101); // duplicate ignored

        System.out.println(treeSet);

        //  COMMON OPERATIONS
        System.out.println("\n---- Common Set Operations ----");

        System.out.println("Contains 103? " + treeSet.contains(103));
        treeSet.remove(105);
        System.out.println("After removing 105: " + treeSet);
        System.out.println("Size: " + treeSet.size());
    }
}
