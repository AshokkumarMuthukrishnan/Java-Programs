package arrays;

import java.util.Arrays;

public class ArrayRightRotate {
    public static void rightRotateByOne(int[] arr) {
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void rightRotate(int[] arr, int r)
    {
        // base case: invalid input
        if (r < 0 || r >= arr.length) {
            return;
        }

        for (int i = 0; i < r; i++) {
            rightRotateByOne(arr);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        rightRotate(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
