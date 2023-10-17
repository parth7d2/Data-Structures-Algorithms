package LeetCode.Arrays;

public class Max_Sum {
    public static void main(String[] args) {
        int[] nums = {-1, -1};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = -1;
        int len = nums.length;
        for(int i = 0; i<len; i++){
            sum += nums[i];
            if(sum<0){
                sum = 0;
            }else if(sum > max && sum >= 0){
                max = sum;
            }
        }
        return max;

    }
}
