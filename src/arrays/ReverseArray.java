package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
