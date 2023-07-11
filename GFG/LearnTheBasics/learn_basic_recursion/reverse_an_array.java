package learn_basic_recursion;

import java.util.Arrays;

public class reverse_an_array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end){
        if(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            reverse(arr, start+1, end-1);
        }
    }


}
