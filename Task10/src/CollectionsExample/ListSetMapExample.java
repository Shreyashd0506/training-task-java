package CollectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMapExample {

    public static void main(String[] args) {

        //  LIST
        System.out.println("---- LIST ----");

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicate allowed

        System.out.println(list);

        //  SET
        System.out.println("\n---- SET ----");

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate NOT allowed

        System.out.println(set);

        //  MAP
        System.out.println("\n---- MAP ----");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(1, "Mango"); // key duplicate → value replaced

        System.out.println(map);
    }
}

