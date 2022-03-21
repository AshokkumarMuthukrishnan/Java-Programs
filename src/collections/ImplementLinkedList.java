package collections;

import java.util.LinkedList;

public class ImplementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.addFirst("Cat");
        animals.addLast("Horse");

        System.out.println(animals);
        System.out.println(animals.getFirst());
        System.out.println(animals.getLast());
    }
}
