package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "a"};

        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Set: " + set);
    }
}
