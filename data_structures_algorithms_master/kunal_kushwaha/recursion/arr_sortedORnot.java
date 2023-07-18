package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class arr_sortedORnot {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        sortedORnot(arr);
    }

    static void sortedORnot(int[] arr) {
        System.out.println(" " + helper(arr, 0, arr.length - 1));
    }

    static boolean helper(int[] arr, int s, int e) {
        if (s == e) {
            return true;
        }
        if(arr[s] > arr[s+1]){
            return false;
        }else {
            return helper(arr, s + 1, e);
        }


    }

}
