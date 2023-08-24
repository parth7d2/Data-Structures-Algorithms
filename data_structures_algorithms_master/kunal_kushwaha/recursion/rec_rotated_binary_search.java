package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class rec_rotated_binary_search {
    public static void main(String[] args){
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rbs(arr, 3, 0, arr.length-1));
    }

    static int rbs(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[s]<= arr[mid]){
            if(arr[s] <= target && target <= arr[mid]){
                return rbs(arr, target, s, mid-1);
            }else {
                return rbs(arr, target, mid+1, e);
            }
        }else {
            if (arr[mid] <= target && target <= arr[e]) {
                return rbs(arr, target, mid + 1, e);
            } else {
                return rbs(arr, target, s, mid - 1);
            }
        }
    }
}
