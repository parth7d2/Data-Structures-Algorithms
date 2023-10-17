package LeetCode.BinarySearch;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }

    static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int first = -1;
        int last = -1;
        for(int i = 0; i<len; i++){
            if(nums[i] == target){
                if(first==-1){
                    first = i;
                }
                last = i;
            }
        }
        int[] ans = {first, last};
        return ans;

    }
}
