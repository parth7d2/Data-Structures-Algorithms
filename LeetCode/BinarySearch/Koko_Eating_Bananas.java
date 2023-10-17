package LeetCode.BinarySearch;

public class Koko_Eating_Bananas {
    public static void main(String[] args){
        int[] nums = {30,11,23,4,20};
        System.out.println(minEatingSpeed(nums,6));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int s = 0, e = findPeakElement(piles);
        while (s<=e){
           int mid = s + (e-s)/2;
           int totalHours = calculateTotalHours(piles, mid);
           if(totalHours <= h){
               e = mid-1;
           }else{
               s = mid+1;
           }
        }
        return s;
    }

    static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

    static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;;
        int n = nums.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

}
