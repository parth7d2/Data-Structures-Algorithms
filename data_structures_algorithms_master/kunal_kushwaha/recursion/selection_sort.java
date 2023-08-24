package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args){
        int[] arr = {9,6,8,7,8,8};
        rec_selection(arr, 0, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void rec_selection(int[] arr, int a, int i, int max){
        if(i>arr.length-1){
            return;
        }
        if(a<arr.length-i){
            if(arr[max] < arr[a]){
                max = a;
            }
            rec_selection(arr, a+1, i, max);
        }else{
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[max];
            arr[max] = temp;
            rec_selection(arr, 0, i+1, 0);
        }
    }
}
