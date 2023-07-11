import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args){
        int arr[] = { 4, 1, 3, 9, 7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; i> 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = a;
        a = b;
        b= temp;
    }
}
