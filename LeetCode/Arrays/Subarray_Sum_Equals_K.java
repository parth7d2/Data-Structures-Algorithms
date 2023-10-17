package LeetCode.Arrays;

public class Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(subarraySum(nums, 2));
    }

    static int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        if(len==1 && nums[0] == k){
           return count;
        }
        for(int i = 0; i<len; i++ ){
            int sum = nums[i];
            if(nums[i] == k){
                count++;
            }
            for(int j = i+1; j<len; j++){
                sum = sum + nums[j];
                int mid = 0;
                if(sum == k ){
                    count++;

                }

            }
        }
        return count;
    }
}
