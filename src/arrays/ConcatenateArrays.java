package arrays;

import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 7, 3, 7};
        int[] b = {4, 6, 6, 2, 19};
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        System.out.println(Arrays.toString(result));
    }
}
