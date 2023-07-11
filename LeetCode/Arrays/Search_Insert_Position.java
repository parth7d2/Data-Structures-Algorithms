package LeetCode.Arrays;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(searchInsert(nums, 5));
    }

    static int searchInsert(int[] nums, int target) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans = i;
                break;
            } else if (nums[i] > target) {
                ans = i - 1;
                break;
            } else if (i == nums.length - 1) {
                ans = i;
            }
        }
        return ans;

    }

}
