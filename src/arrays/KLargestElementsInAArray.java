package arrays;

import java.util.Arrays;

public class KLargestElementsInAArray {
    public static void main(String[] args) {
        int[] arr = {-2,3,4,-1,-3,1,2,-4,0};
        int k = 3;
        Boolean flag = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    flag = true;
                }

            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");

    }
}
