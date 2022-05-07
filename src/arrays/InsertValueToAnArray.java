package arrays;

import java.util.Arrays;

public class InsertValueToAnArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int position = 5, value = 35;
        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i-1];
        }
        array[position] = value;

        System.out.println(Arrays.toString(array));

    }
}
