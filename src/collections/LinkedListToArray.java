package collections;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Horse");

        String[] arr = new String[animals.size()];
        animals.toArray(arr);
        for (String item : arr) {
            System.out.print(item + ", ");
        }

//        ListIterator<String> iterate = animals.listIterator();
//        while (iterate.hasNext()) {
//            System.out.println(iterate.next() + " ");
//        }
    }
}
