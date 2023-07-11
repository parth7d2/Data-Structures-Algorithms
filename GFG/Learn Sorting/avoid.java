import java.util.Arrays;

public class avoid {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5, 6};
        cycle(arr);
//        System.out.println(Arrays.toString(arr));
        int[] num = {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        System.out.println(bst(num, 11));
    }

    static void cycle(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }


    static int linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return index;

    }

    static int bst(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return index;
    }
}
