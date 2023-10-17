package LeetCode.Arrays;

public class Single_Number {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2,5,4};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        int count = -1;
        int len = nums.length;
        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                if(nums[i] - nums[j] == 0 && j != i){
                    break;
                }
                if(j==len-1){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
