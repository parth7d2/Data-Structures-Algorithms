import GFG.LearnSorting.Sorting-I;
import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        System.out.println(Arrays.toString(bubble(arr)));
    }

    private static int[] bubble(int[] arr) {
        int[] num = arr;
        boolean cond = true;
        for(int i = 0; i<num.length; i++){
            cond = false;
            for(int j = 0; j<num.length-i-1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] =temp;
                    cond=true;
                }
            }
            if(!cond){
                break;
            }
        }
        return num;
    }


}