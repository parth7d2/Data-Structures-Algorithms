package LeetCode.Arrays;

public class Check_Sorted_and_Rotated {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        return count <= 1;
    }

}
