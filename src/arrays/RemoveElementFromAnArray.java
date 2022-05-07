package arrays;

import java.util.Arrays;

public class RemoveElementFromAnArray {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int ele = 36;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ele) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j+1];
                }
                break;
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
