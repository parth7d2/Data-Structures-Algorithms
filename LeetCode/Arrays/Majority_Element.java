package LeetCode.Arrays;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    static int majorityElement(int[] nums) {
        int len = nums.length;
        int min = len/2;
        for(int i = 0; i<len; i++){
            int count = 0;
            for(int j = 0; j<len; j++){
                if(nums[i] == nums[j] && i != j){
                    count++;
                }
                if(count >= min){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}
