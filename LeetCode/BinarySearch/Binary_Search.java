package LeetCode.BinarySearch;

public class Binary_Search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 5));
    }

    static int search(int[] nums, int target) {
        int len = nums.length;
        int start = 0;
        int end = len-1;

        while (start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid+1;
            }
            if(nums[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
