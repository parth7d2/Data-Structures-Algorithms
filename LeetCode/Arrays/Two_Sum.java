package LeetCode.Arrays;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for(int i = 0; i<nums.length; i++){
            if(i == nums.length){
                break;
            }
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }
        sum[0] = -1;
        sum[1] = -1;
        return sum;
    }
}
