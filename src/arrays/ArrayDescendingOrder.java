package arrays;

import java.util.Arrays;

public class ArrayDescendingOrder {
    public static void main(String[] args) {
        int[] arr = { 2, 8, 26, 18, 29, 35, 4, 40 };
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
