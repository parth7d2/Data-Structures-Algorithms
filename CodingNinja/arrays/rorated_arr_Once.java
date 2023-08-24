package CodingNinja.arrays;

import java.util.Arrays;

public class rorated_arr_Once {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(rotatedOnlyOnce(arr, 6)));
        rotate(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

//    static int[] rotatedOnlyOnce(int[] arr, int n){
//        int temp = arr[0];
//        for(int i = 0; i<n-1; i++){
//            arr[i] = arr[i+1];
//        }
//        arr[n-1] = temp;
//        return arr;
//    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = n-k-1;
        int[] ans = new int[n+1];
        for(int i = n-k; i<n; i++){
            ans[i-(n-k)] = nums[i];
        }
        for(int i = k; i<n; i++){
            ans[i] = nums[i-k];
        }
        for(int i=0; i<n; i++){
            nums[i] = ans[i];
        }
    }
}
