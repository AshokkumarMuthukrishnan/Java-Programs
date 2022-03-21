package collections;

import java.util.HashMap;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<String, String> languages = new HashMap<>();
        languages.put("Java", "Enterprise");
        languages.put("Python", "ML/AI");
        languages.put("JavaScript", "Frontend");
        languages.put("HTML", "Web");

        // iterating through keys
        System.out.print("\nKeys: ");
        for (String key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");
        }

        // iterating through values
        System.out.print("\nValues: ");
        for (String value : languages.values()) {
            System.out.print(value);
            System.out.print(", ");
        }
    }
}
