import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxInd= getMaxIndex(arr, 0, last);
            swap(arr, maxInd, last);
        }
    }

    static int getMaxIndex(int[] arr, int a, int last){
        int max = 0;
        for(int i = 0; i<=last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int max, int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }

}
