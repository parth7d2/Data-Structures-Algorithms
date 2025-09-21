import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {12, 15, 13, 12, 47, 96};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] nums){
        int len = nums.length;
        if(len<=0){
            return nums;
        }else{
            for(int i=0; i<len; i++){
                for(int j=0; j<len-i-1; j++){
                    if(nums[j]>nums[j+1]){
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
