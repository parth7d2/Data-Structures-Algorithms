package LeetCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class phone_letter_combination {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static  List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            ArrayList<String> ans1 = new ArrayList<>();
            return ans1;
        }
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ArrayList<String> ans1 = new ArrayList<>();
        helper(digits, "", arr , ans1);
        return ans1;
    }

    private static void helper(String nums, String ans, String[] arr, ArrayList<String> ans1) {
        if(nums.isEmpty()){
            ans1.add(ans);
            return;
        }

        int a = nums.charAt(0) - '0';
        String s = arr[a];
        List<String> ans2 = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            helper(nums.substring(1), ans+s.charAt(i), arr, ans1);
        }

    }


}
