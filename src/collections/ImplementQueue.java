package collections;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementQueue {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.offer(5);

        int removedNo = numbers.poll();
        System.out.println(removedNo);

        System.out.println(numbers);
    }
}
