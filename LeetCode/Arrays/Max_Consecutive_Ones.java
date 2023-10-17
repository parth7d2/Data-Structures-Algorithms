package LeetCode.Arrays;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes2(int[] nums) {
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

    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
            }else{
                count = 0;
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }

}
