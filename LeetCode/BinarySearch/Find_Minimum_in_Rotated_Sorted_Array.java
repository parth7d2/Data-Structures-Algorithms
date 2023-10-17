package LeetCode.BinarySearch;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {30,11,23,4,20};
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        int pivot = pivot(nums);
        if(nums[0] > nums[pivot+1] && pivot<nums.length-1){
            return nums[pivot+1];
        }else {
            return nums[0];
        }

    }

    static int pivot(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[start]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
