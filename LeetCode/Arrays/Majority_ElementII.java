package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    static List<Integer> majorityElement2ndTime(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> num_set = new HashSet<>();
        int len = nums.length;
        int n = len/3;
        for(int i = 0; i<len; i++){
            int count = 0;
            if (!num_set.contains(nums[i])) {
                for (int j = 0; j < len; j++) {
                    if (nums[i] == nums[j] ) {
                        count++;
                    }
                }
                if (count > n) {
                    num_set.add(nums[i]);
                }
            }
        }
        ans.addAll(num_set);
        return ans;
    }

}
