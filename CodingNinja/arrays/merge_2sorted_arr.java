package CodingNinja.arrays;

import java.util.ArrayList;
import java.util.List;

public class merge_2sorted_arr {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int[] b = {2, 2, 4};
        System.out.println(sortedArray(a, b));
    }

    static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        List list = new ArrayList<Integer>();

        int l1 = a.length-1;
        int l2 = b.length-1;

        int i = 0;
        int j = 0;
        int count = 0;

        boolean firstTime = false;

        while (i <= l1 && j <= l2){
            int num = 0;
            if(firstTime) {
                num = (int) list.get(count);
                count++;
            }
            if(firstTime && a[i] == num ){
                i++;
            } else if(firstTime && b[j] == num){
                j++;
            } else if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
                firstTime = true;
            }else if(a[i] < b[j]){
                list.add(a[i]);
                i++;
                firstTime = true;
            }else{
                list.add(b[j]);
                j++;
                firstTime = true;
            }
        }

        while(i<=l1){
            list.add(a[i]);
            count++;
            i++;
        }

        while (j<=l2){
            list.add(b[j]);
            count++;
            j++;
        }


        return list;
    }
}
