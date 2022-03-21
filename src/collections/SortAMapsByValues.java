package collections;

import java.util.*;

public class SortAMapsByValues {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, "python");
        map.put(3, "javascript");
        map.put(4, "php");
        map.put(5, "Node Js");

        List<String> str = new ArrayList<>(map.values());

        Collections.sort(str);

        System.out.println(str);

    }
}
