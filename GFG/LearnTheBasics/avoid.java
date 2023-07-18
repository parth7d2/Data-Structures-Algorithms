package GFG.LearnTheBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class avoid {

//    public static void main(String[] args) {
//        int[] arr = {3, 4, 6, 8, 9};
//        System.out.println(print(arr, 8, 0, arr.length-1));
//    }
//
//    static int print(int[] arr, int target, int start, int end){
//
//        if(start>end){
//            return -1;
//        }
//        int mid = start + (end-start)/2;
//
//        if(arr[mid] == target) return mid;
//
//        else if (arr[mid] < target){
//            return print(arr, target, mid+1, arr.length-1);
//        }
//        else{
//            return print(arr, target, 0, mid-1);
//        }
//    }

    public static void main(String[] args) {
//        printTriangle(5);
//        int[] arr = {1, 2, 3, 4, 5};
//        arr[4] = 7;
//        char c = 0xbeef;
//        float f3 = 0x12345;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(f3);
//
//        int[][] argCopy = new int[2][2];
//        argCopy[0][0] = 9;
//        argCopy[0][1] = 8;
//        argCopy[0][0] = 0;
//        System.out.println(Arrays.toString(argCopy[0]));

        String a = "skdpnyegmds";
        System.out.println(isPalindrome(a));


    }

    static int start = 0;
    static int end = 0;
    static int count = 0;
    public static boolean isPalindrome(String str) {
        // Write your code here.
        start = count;
        end = str.length() - 1 - count;

        if (start >= end) {
            return true;
        } else if (str.charAt(start) != str.charAt(end)) {
            return false;
        } else {
            start++;
            end--;
            count++;
            return isPalindrome(str);
        }


    }


//    static void printTriangle(int n) {
//        // code here
//        for(int i = 0; i<n; i++){
//            char a = 'A';
//            for(int j = n; j>0; j--){
//                System.out.print(a);
//                a++;
//            }
//            System.out.println();
//        }
//    }

//    static void printTriangle(int n) {
//        // code here
//        for(int i=0; i<n; i++){
//            char alpha = 'A';
//            for(int j = 0; j<n-i-1; j++){
//                System.out.print(" ");
//            }
//            for(int j=0; j<=i; j++){
//                System.out.print(alpha);
//                alpha++;
//            }
//            for(int j=1; j<=i; j++){
//                int c = (int)alpha - j - 1;
//                System.out.print((char)c);
//            }
//            System.out.println();
//        }
//    }

//    static ArrayList<Long> arrayList = new ArrayList<>();
//    static ArrayList<Long> factorialNumbers(long N) {
//
//
//        // code here
//        if (N <= 1) {
//            arrayList.add(N);
//            return arrayList;
//        }
//        if(N*(N-1) <= 6){
//            arrayList.add(N*(N-1));
//
//        }
//       return factorialNumbers(N-1);
//    }

}

//class Solution{
//    static ArrayList<Long> factorialNumbers(long N){
//
//    }
//}