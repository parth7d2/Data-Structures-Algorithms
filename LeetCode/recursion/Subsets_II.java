package LeetCode.recursion;

import java.util.*;

public class Subsets_II {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetsWithDup(arr));
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans, new ArrayList<>());
        return ans;
    }

    private static void helper(int[] nums, int idx, List<List<Integer>> ans, ArrayList<Integer> arr) {

        ans.add(new ArrayList<>(arr));
        for(int i = idx; i<nums.length; i++){
            if(i!=idx && nums[i] == nums[i-1]){
                continue;
            }
            arr.add(nums[i]);
            helper(nums, i+1, ans, arr);
            arr.remove(arr.size()-1);
        }
    }


}
