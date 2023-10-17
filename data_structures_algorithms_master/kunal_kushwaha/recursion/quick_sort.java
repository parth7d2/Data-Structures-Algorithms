package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.Arrays;

public class quick_sort {
    public static void main(String[] args) {
        int[] arr= {4,21, 0, 1,-2};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, hi);
    }
}
