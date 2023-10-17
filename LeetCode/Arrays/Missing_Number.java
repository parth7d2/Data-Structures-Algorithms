package LeetCode.Arrays;

public class Missing_Number {
    // Missing Number
    // Given an array nums containing n distinct numbers in the range [0, n], return
    // the only number in the range that is missing from the array.
    public static void main(String[] args) {
        int[] arr = {1, 0};
        System.out.println(missingNumber2(arr));
    }

    static int missingNumber(int[] arr) {
        int target;
        int l = arr.length;
        int total = l * (l + 1) / 2;
        int n = 0;
        for (int i : arr) {
            n += i;
        }
        target = total - n;
        return target;

    }

    static int missingNumber2(int[] nums) {

        for(int i = 0; i<nums.length; i++){
            boolean mis = true;
            for(int j = 0; j<nums.length; j++){
                if(i == nums[j]){
                    mis = false;
                    break;
                }else if (j == nums.length-1 && mis){
                    return i;
                }
            }
        }
        return nums.length;
    }

}
