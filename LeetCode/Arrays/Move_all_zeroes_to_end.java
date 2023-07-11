
package LeetCode.Arrays;

import java.util.Arrays;

public class Move_all_zeroes_to_end {

    // 283. Move all zeroes to end of array
    // -Given an integer array arr, move all 0's to the end of it while maintaining
    // the relative order of the non-zero elements.
    // -Note that you must do this in-place without making a copy of the array.

    // Approach and thought process:
    // Here, our 1st task is to put non-negative elements in the front of the array,
    // So we can create a new temporary array and update indices of this temp array
    // from starting with non-negative elements and while doing this we can count
    // the number of Zeros also, So we will count the number of zeros and fill
    // remaining indices of temp array with zero.

    // Let’s see the algorithm:
    // -Create a temp array of length input array.
    // -Traverse through array and if a non negative elements encounter then put
    // this
    // element in the temp array at zero index and increment index.
    // -Fill the zeros in remaining places of temp array.
    // Time complexity: o(n)
    // Space complexity: o(n)
    static void zerosToEnd1(int arr[]) {
        int n = arr.length;
        int temp[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }

        }
        while (k < n) {
            temp[k] = 0;
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 1, 0, 4, 0 };
        zerosToEnd2(arr);
    }

    static void zerosToEnd2(int[] arr) {
        int k = 0;
        while (k < arr.length) {
            if (arr[k] == 0) {
                break;
            } else {
                k += 1;
            }
        }

        int i = k, j = k + 1;
        while (i < arr.length && j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }

        System.out.println(Arrays.toString(arr));
    }

}