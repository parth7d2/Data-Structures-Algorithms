package LeetCode.BinarySearch;

public class Find_Peak_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int len = nums.length;
        int peak = -1;
        if(len == 1){
            return 0;
        }
        if(len>1){
            peak = 0;
            for(int i = 0; i<len-1; i++){
                if(nums[i+1]>nums[i]){
                    peak = i+1;
                }
            }
            return peak;
        }
        return peak;
    }

}
