package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class arr_sortedORnot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        helper(arr, 0);
    }

    static void sortedORnot(int[] arr) {
        System.out.println(" " + helper(arr, 0));
    }

    static boolean helper(int[] arr, int s) {
        if (s == arr.length - 1) {
            return true;
        }
        return arr[s] < arr[s + 1] && helper(arr, s + 1);

    }

}
