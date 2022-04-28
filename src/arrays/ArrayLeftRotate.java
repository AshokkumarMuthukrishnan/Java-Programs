package arrays;

import java.util.Arrays;

public class ArrayLeftRotate {
    public static void leftRotateByOne(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void leftRotate(int[] arr, int r) {
        // base case: invalid input
        if (r < 0 || r >= arr.length) {
            return;
        }

        for (int i = 0; i < r; i++) {
            leftRotateByOne(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        leftRotate(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
