package CodingNinja.arrays;

import java.util.ArrayList;

public class remove_duplicates_arr {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        System.out.println(removeDuplicates(nums, 4));
    }
    public static int removeDuplicates(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int a = 0;
        for(int i = 0; i<arr.size()-1; i++){
            if(arr.get(i) != arr.get(i+1)){
                a++;
            }
        }
        return a+1;
    }
}
