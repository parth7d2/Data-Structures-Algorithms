package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr= {4,21, 0, 1,-2};
        rec_bubble(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void rec_bubble(int[] arr, int i, int a){
        if(i == arr.length-1){
            return;
        }
        if(a<arr.length-i-1){
            if(arr[a] > arr[a+1]){
                int temp = arr[a+1];
                arr[a+1] = arr[a];
                arr[a] = temp;
            }
            rec_bubble(arr, i, a+1);
        }else{
            rec_bubble(arr, i+1, 0);
        }
    }


}
