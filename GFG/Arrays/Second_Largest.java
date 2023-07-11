/* Second Largest
Given an array Arr of size N, 
print second largest distinct element from an array. */

package GFG.Arrays;

public class Second_Largest {

    // Approach:
    // Find the smallest and largest element in the array in a single traversal
    // After this, we once again traverse the array and find an element that is just
    // greater than the smallest element we just found.
    // Similarly, we would find the largest element which is just smaller than the
    // largest element we just found
    // Indeed, this is our second smallest and second largest element.
    // Time Complexity: O(N), We do two linear traversals in our array
    // Space Complexity: O(1)

    static int SecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        int Second_largest = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > Second_largest && i != largest) {
                Second_largest = i;
            }
        }
        return Second_largest;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.print(secondLargest(arr));
    }

    // Approach:
    // If the current element is larger than ‘large’ then update second_large and
    // large variables
    // Else if the current element is larger than ‘second_large’ then we update the
    // variable second_large.
    // Once we traverse the entire array, we would find the second largest element
    // in the variable second_large.
    // Here’s a quick demonstration of the same.
    // Time Complexity: O(N), Single-pass solution
    // Space Complexity: O(1)
    static private int secondLargest(int[] arr) {
        if (arr.length < 2)
            return -1;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                second_large = large;
                large = arr[i];
            }

            else if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }
        return second_large;
    }

}