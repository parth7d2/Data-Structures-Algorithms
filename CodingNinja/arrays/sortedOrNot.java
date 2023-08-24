package CodingNinja.arrays;

public class sortedOrNot {
    public static void main(String[] args){
        int[] a = {2, 2, 4, 7, 8,9};
        System.out.println(isSorted(4, a));
    }

    public static int isSorted(int n, int []a) {
        // Write your code here.
        if(n < 2){
            return 1;
        }
        if(a[n-1] >= a[n-2]){
            return isSorted(n-1, a);
        }else{
            return 0;
        }
    }
    
}
