package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class arr_sortedORnot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 9, 5, 6, 7, 6};
        sortedORnot(arr);
    }


    static void sortedORnot(int[] arr) {
        System.out.println(helper(arr, 0));
    }

    static boolean helper(int[] arr, int s) {
        if (s == arr.length - 1) {
            return true;
        }
        return arr[s] < arr[s + 1] && helper(arr, s + 1);
    }



}
