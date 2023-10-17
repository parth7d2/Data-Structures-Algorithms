package LeetCode.Arrays;

public class Maximum_Product_Subarray {
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }

    static int maxProduct(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        int total = 1;
        int ans = 0;
        for(int i = 0; i<len; i++){
            total = 1;
            for(int j = i; j<len; j++){
                total *= nums[j];
                if(ans<total ){
                    ans = total;
                }

            }
        }
        return ans;
    }
}
