package LeetCode.BinarySearch;

public class Search_Insert_Position {
    public static void main(String[] args){
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 0));
    }

    static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans = -1;
        while (s<=e){
            int mid = s + (e-s)/2;
            if(target<=nums[mid]){
                ans = mid;
                e = mid-1;

            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}
