
import java.util.Arrays;

public class selection_sort {

    public static void main(String[] args) {
        int[] arr = {23, 342, 1, 2, 97, 73};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] nums) {
        int len = nums.length;
        if (len <= 0) {
            return nums;
        }

        for (int i = 0; i < len - 1; i++) {
            int small = i;
            for (int j = i; j < len; j++) {
                if (nums[small] > nums[j]) {
                    small = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[small];
            nums[small] = temp;
        }
        return nums;
    }
}
