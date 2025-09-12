
public class linear_search{

    public static void main(String[] args){
        int[] arr = {21, 11, 24, 12, 35, 13, 83, 14};
        System.out.println(linearSearch(arr, 83));

    }

    static int linearSearch(int[] arr, int target){
        int len = arr.length;
        if(len == 0){
            return -1;
        }
        for(int i = 0; i<len; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return-1;
    }
}