package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Majority_ElementII {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        System.out.println(majorityElement(arr));
    }

    static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n) {
                list.add(nums[i]);
            }
        }
        return list;
    }

}
