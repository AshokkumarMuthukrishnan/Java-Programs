package collections;

import java.util.ArrayList;

public class IterateArrayListByLambdaExp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}
