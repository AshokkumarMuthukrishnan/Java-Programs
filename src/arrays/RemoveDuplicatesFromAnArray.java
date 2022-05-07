package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromAnArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3,4,5,6,7,7};
        int[] temp = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] != nums[i+1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[nums.length -1];

        for (int i=0; i<j; i++) {
            nums[i] = temp[i];
        }

        for (int i = 0; i < j; i++)
            System.out.print(temp[i] + " ");
    }
}
