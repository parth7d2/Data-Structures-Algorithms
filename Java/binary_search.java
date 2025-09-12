public class binary_search{
    public static void main(String[] args){
        int[] arr = {12, 24, 25, 28, 36, 43};
        System.out.println(binary(arr, 12));
    }

    static int binary(int[] nums , int target){
        int ans = -1;
        if(nums.length == 0){
            return ans;
        }else{
            int start = 0;
            int end = nums.length-1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] == target){
                    return mid;
                }
                else if (target>nums[mid]){
                    start= mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}