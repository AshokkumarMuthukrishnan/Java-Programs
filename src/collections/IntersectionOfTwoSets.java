package collections;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoSets {
    public static void main(String[] args) {
        Set<Integer> setExp1 = new HashSet<>();
        setExp1.add(1);
        setExp1.add(2);
        setExp1.add(3);
        setExp1.add(4);
        setExp1.add(5);

        Set<Integer> setExp2 = new HashSet<>();
        setExp2.add(5);
        setExp2.add(3);
        setExp2.add(1);
        setExp2.add(8);
        setExp2.add(9);

        setExp1.retainAll(setExp2);
        System.out.println(setExp1);
    }
}
