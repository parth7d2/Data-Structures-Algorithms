package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSet(arr));
    }

    //process
    /*
    * first create whole list and its name is outer
    * 2nd add empty list in that outerlist
    * 3rd run for each loop and it give number
    * 4th find out length
    * 5th run for loop because we add number into each outerlist array
    * 6th create internal list
    * 7th one by one array come into the outerlist
    * 8th add num into that array
    * 9th internal list add into outerlist
    * 10th return outerlist
    */

    static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i<n; i++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
