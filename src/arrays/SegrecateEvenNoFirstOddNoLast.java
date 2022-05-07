package arrays;

import java.util.Arrays;

public class SegrecateEvenNoFirstOddNoLast {
    public static void main(String[] args) {
        int arr[] = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
           while (arr[left]%2 == 0) {
               left++;
           }
           while (arr[right]%2 == 1) {
               right--;
           }

           if(left < right) {
               int temp=arr[left];
               arr[left]=arr[right];
               arr[right]=temp;
           }
        }

        System.out.println(Arrays.toString(arr));
    }
}
