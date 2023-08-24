package CodingNinja.arrays;

import java.util.Arrays;

public class secondSmallestandLargest {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 4, 8, 4, 3, 10};
        System.out.println(Arrays.toString(getSecondOrderElements(8, arr)));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int[] nums = new int[2];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        return getSecondOrder(a, n - 1, max, min, max, min, nums);
    }

    static int[] getSecondOrder(int[] arr, int n, int s, int l, int ss, int ls, int[] nums) {
        if (n < 0) {
            return nums;
        }

        if (arr.length <= 2) {
            nums[0] = -1;
            nums[1] = -1;
            return nums;
        }

        if (s > arr[n]) {
            s = arr[n];
        }else if (ss > arr[n] && arr[n] != s) {
            ss = arr[n];
            nums[0] = ss;
        }
        if (l < arr[n]) {
            l = arr[n];
        }else if(ls < arr[n] && arr[n] != l) {
            ls = arr[n];
            nums[1] = ls;
        }

        return getSecondOrder(arr, n - 1, s, l, ss, ls, nums);
    }

}
