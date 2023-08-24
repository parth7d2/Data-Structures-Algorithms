package CodingNinja.arrays;

public class largest_elements {
    public static void main(String[] args){
        int[] arr= {5 ,9 ,3 ,4 ,8, 4 ,3, 10 };
        System.out.println(largestElement(arr, 5));
    }

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        return largest(arr, n-1, 0);

    }

    static int largest(int[] arr, int n, int max){
        if(n<0){
            return max;
        }
        if(max < arr[n] ){
            max = arr[n];
        }
        return largest(arr, n-1, max);
    }
    
}
