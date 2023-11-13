package LeetCode.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

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
     * 7th one by one array come from the outerlist ("outer.get(i)") and add into internal list
     * 8th add num into that array
     * 9th internal list add into outerlist
     * 10th return outerlist
     */

    public static List<List<Integer>> subSet(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num : nums){
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
