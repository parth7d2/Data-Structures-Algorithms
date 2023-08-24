package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,5};
        System.out.println(linearSearch(arr, 4));
    }

    // return index;

//    static int linearSearch(int[] arr, int target){
//       return Search(arr, target, 0);
//    }
//
//    static int Search(int[] arr, int target, int idx){
//        if(idx == arr.length){
//            return -1;
//        }
//        if(arr[idx] == target){
//            return idx;
//        }
//        return Search(arr, target, idx+1);
//    }

    // return indexes;

    static ArrayList<Integer> linearSearch(int[] arr, int target){
        ArrayList<Integer> arrlist = new ArrayList<>();
        return Search(arr, target, 0, arrlist);
    }

    static ArrayList<Integer> Search(int[] arr, int target, int idx, ArrayList<Integer> arrlist){
        if(idx == arr.length){
            return arrlist;
        }
        if(arr[idx] == target){
            arrlist.add(idx);
        }
        return Search(arr, target, idx+1, arrlist);
    }

    // return the list of indexes without passing the argument

//    static ArrayList<Integer> linearSearch(int[] arr, int target){
//        return Search(arr, target, 0);
//    }
//
//    static ArrayList<Integer> Search(int[] arr, int target, int idx){
//        ArrayList<Integer> arrlist = new ArrayList<>();
//        if(idx == arr.length){
//            return arrlist;
//        }
//        if(arr[idx] == target){
//            arrlist.add(idx);
//        }
//        ArrayList<Integer> arrayList =  Search(arr, target, idx+1);
//        arrlist.addAll(arrayList);
//        return arrlist;
//    }
    
}
