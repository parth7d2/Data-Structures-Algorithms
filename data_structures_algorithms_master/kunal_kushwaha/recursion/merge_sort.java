package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.Arrays;

public class merge_sort{
    public static void main(String[] args){
        int[] arr= {4,21, 0, 1,-2};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr,0, mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mergesort = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergesort[k] = first[i];
                i++;
            }else if (first[i] >= second[j]){
                mergesort[k] = second[j];
                j++;
             }
            k++;
        }
        

       
        while(i<first.length){
            mergesort[k] = first[i];
            i++;
            k++;
        }
        
        while(j<second.length){
            mergesort[k] = second[j];
            j++;
            k++;
        }
        

        return mergesort;

    }
}