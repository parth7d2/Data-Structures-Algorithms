package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Next_Permutation {
    public static void main(String[] args) {

    }

    static List<Integer> nextPermutation2(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums) {
            list.add(i);
        }
        int n = nums.length;
        int k = n - 2;

        // null checks
        if (n == 0 || nums == null) {
            return list;
        }

        // find k
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1]) {
                k--;
            } else {
                break;
            }
        }

        // if k==-1 reverse
        if (k == -1) {
            reverse(list, 0, n - 1);
        } else { // else replace k with next grater element reverse
            for (int i = n - 1; i > 0; i--) {
                if (list.get(k) < list.get(i)) {
                    int temp = list.get(k);
                    list.set(k, list.get(i));
                    list.set(i, temp);
                    break;
                }
            }
            reverse(list, k + 1, n - 1);
        }
        return list;
    }

    static void reverse(List<Integer> list, int start, int end) {
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }




}
