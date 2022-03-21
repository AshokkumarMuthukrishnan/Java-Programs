package collections;

import java.util.ArrayList;

public class CustomObjectSort {
    private final String name;

    public CustomObjectSort(String val) {
        this.name = val;
    }

    public String name() {
        return this.name;
    }

    public static void main(String[] args) {
        ArrayList<CustomObjectSort> list = new ArrayList<>();
        list.add(new CustomObjectSort("java"));
        list.add(new CustomObjectSort("php"));
        list.add(new CustomObjectSort("ruby"));
        list.add(new CustomObjectSort("js"));
        list.add(new CustomObjectSort("python"));
        list.add(new CustomObjectSort("c++"));

        list.sort(((o1, o2) -> o1.name().compareTo(o2.name())));

        for (CustomObjectSort obj : list) {
            System.out.println(obj.name());
        }
    }
}
