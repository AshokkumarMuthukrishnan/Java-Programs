package collections;

import java.util.ArrayList;

public class JoinLists {
    public static void printArrayLists(ArrayList<String> list) {
        for (String i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        printArrayLists(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("e");
        list2.add("f");

        ArrayList<String> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joinedList);

    }
}
