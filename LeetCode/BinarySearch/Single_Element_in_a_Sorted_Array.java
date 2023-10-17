package LeetCode.BinarySearch;

public class Single_Element_in_a_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[len-1] != nums[len-2]){
            return nums[len-1];
        }

        int s = 1;
        int e = len-2;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if((mid % 2 == 1 && nums[mid-1] == nums[mid]) || (mid%2 == 0 && nums[mid+1] == nums[mid])){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }

        return -1;
    }

}
