package LeetCode.Arrays;

import java.util.Arrays;

public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    static int[] rearrangeArray(int[] nums) {
        int len = nums.length;
        int min = 1;
        int max = 0;
        int[] ans = new int[len];

        for (int j = 0; j < len; j++) {
            if (nums[j] > 0) {
                ans[max] = nums[j];
                max += 2;

            }
        }
        for (int j = 0; j < len; j++) {
            if (nums[j] < 0) {
                ans[min] = nums[j];
                min += 2;
            }
        }


        return ans;

    }
}
