/* 
Largest Element in Array
-Given an array A[] of size n. The task is to find the largest element in it.
*/

package GFG.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class largestelements {

    // Intuition: We can sort the array in ascending order, hence the largest
    // element will be at the last index of the array.
    // Approach:
    // Sort the array in ascending order.
    // Print the (size of the array -1)th index.
    // Time Complexity: O(N*log(N))
    // Space Complexity: O(n)
    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 7, 8, 3 };
        System.out.print(sort(arr));
    }

    // Intuition: We can sort the array in ascending order, hence the largest
    // element will be at the last index of the array.
    // Approach:
    // Create a max variable and initialize it with arr[0].
    // Use a for loop and compare it with other elements of the array.
    // If any element is greater than the max value, update max value with the
    // element’s value.
    // Print the max variable.
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    static int largestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}