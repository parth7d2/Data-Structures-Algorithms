package LeetCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        System.out.println(combinationSum(arr, 7));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void helper(int[] candidates, int idx, int target, List<Integer> arr, List<List<Integer>> ans) {
        if (idx == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if (candidates[idx] <= target) {
            int no = candidates[idx];
            arr.add(no);
            helper(candidates, idx, target - no, arr, ans);
            arr.remove(arr.size()-1);
        }
        helper(candidates, idx + 1, target, arr, ans);
    }
}
