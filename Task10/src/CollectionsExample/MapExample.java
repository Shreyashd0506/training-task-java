package CollectionsExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        //  HASHMAP
        System.out.println("---- HashMap (No Order) ----");

        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(103, 85);
        hashMap.put(101, 90);
        hashMap.put(102, 78);
        hashMap.put(101, 95); // overwrites old value

        printMap(hashMap);

        //  LINKEDHASHMAP
        System.out.println("\n---- LinkedHashMap (Insertion Order) ----");

        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(103, 85);
        linkedHashMap.put(101, 90);
        linkedHashMap.put(102, 78);

        printMap(linkedHashMap);

        //  TREEMAP
        System.out.println("\n---- TreeMap (Sorted by Key) ----");

        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(103, 85);
        treeMap.put(101, 90);
        treeMap.put(102, 78);

        printMap(treeMap);

        //  COMMON OPERATIONS
        System.out.println("\n---- Common Map Operations ----");

        System.out.println("Marks of Roll 101: " + treeMap.get(101));
        System.out.println("Contains key 102? " + treeMap.containsKey(102));

        treeMap.remove(103);
        System.out.println("After removing roll 103:");
        printMap(treeMap);
    }

    // Common method to print map entries
   public static void printMap(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Roll No: " + entry.getKey()
                    + " | Marks: " + entry.getValue());
        }
    }
}
