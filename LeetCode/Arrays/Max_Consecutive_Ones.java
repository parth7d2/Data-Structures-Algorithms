package LeetCode.Arrays;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {

    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > ans) {
                ans = count;
            }
        }
        return ans;
    }

}
