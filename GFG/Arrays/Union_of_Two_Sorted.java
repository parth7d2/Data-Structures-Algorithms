package GFG.Arrays;

import java.util.ArrayList;

public class Union_of_Two_Sorted {
    // static ArrayList<Integer> findUnion(int arr1[], int arr2[]) {
    // int n = arr1.length;
    // int m = arr2.length;
    // int motu = Math.max(n, m);
    // int[] nums1 = new int[motu];
    // if (n > m) {
    // nums1 = arr1;
    // } else {
    // nums1 = arr2;
    // }
    // HashSet<Integer> map = new HashSet<>();
    // ArrayList<Integer> list = new ArrayList<>();
    // int i = 0;
    // int j = 0;
    // while (j < m || i < n) {
    // if (i < n && j < m) {
    // int min = Math.min(arr1[i], arr2[j]);
    // int max = Math.max(arr1[i], arr2[j]);
    // map.add(min);
    // map.add(max);
    // } else {
    // map.add(nums1[i]);
    // }
    // i++;
    // j++;
    // }
    // for (int it : map) {
    // list.add(it);
    // }
    // return list;

    // }

    public static void main(String args[]) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val : Union)
            System.out.print(val + " ");
    }

    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> Union = new ArrayList<>();
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
