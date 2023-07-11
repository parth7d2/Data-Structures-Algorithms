package LeetCode.Arrays;

import java.util.ArrayList;

public class Remove_Element {
    public static void main(String[] args) {

    }

    static int removeElement(int[] nums, int val) {
        int l = nums.length;
        int count = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                i++;
            } else {
                count++;
            }
        }
        return count;
    }
}