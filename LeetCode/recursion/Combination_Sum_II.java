package LeetCode.recursion;

import java.util.*;

public class Combination_Sum_II {

    public static void main(String[] args) {
        int[] arr = {2,5,2,1,2};
        System.out.println(combinationSum2(arr, 5));
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<>(), ans);
        return new ArrayList<>(ans);
    }

    private static void helper(int[] candidates, int idx, int target, List<Integer> arr, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i = idx; i<candidates.length; i++){
            if(i>idx && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            arr.add(candidates[i]);
            helper(candidates, i + 1, target - candidates[i], arr, ans);
            arr.remove(arr.size()-1);
        }

    }


}
