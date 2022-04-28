package arrays;

import java.util.Arrays;

public class RemoveAllOccurancesFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 5, 3, 2 };
        int key = 3;

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[index++] = arr[i];
            }
        }
        arr = Arrays.copyOf(arr, index);

        System.out.println(Arrays.toString(arr));

    }
}
