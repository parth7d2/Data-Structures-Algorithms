package LeetCode.Arrays;

public class Missing_Number {
    // Missing Number
    // Given an array nums containing n distinct numbers in the range [0, n], return
    // the only number in the range that is missing from the array.
    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(arr));
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

}
