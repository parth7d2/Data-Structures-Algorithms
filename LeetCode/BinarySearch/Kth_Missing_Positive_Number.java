package LeetCode.BinarySearch;


public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        System.out.println(findKthPositive(arr, 4));
    }
    static int findKthPositive(int[] arr, int k) {
        int s = 0;
        int e = arr.length-1;
        while (s<=e){
            int mid = s+(e-s)/2;
            int missing = arr[mid] - (mid+1);
            if(missing < k){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return e+1+k;
    }
}
