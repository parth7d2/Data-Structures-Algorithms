public class rec_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        sorted(arr, arr.length - 1);

    }

    static void sorted(int[] arr, int length) {
        if (length == 1) {
            System.out.println("Array are sorted in ascending order");
            return;
        }
        if (arr[length] <= arr[length - 1]) {
            System.out.println("Array are not sorted in ascending order");
            return;
        }
        sorted(arr, length - 1);
    }

}
