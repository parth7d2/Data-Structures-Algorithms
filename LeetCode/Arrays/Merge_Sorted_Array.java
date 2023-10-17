package LeetCode.Arrays;

import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m;
        int len2 = n;

        int s1 = 0;
        int s2 = 0;

        int[] ans = new int[m+n];
        int count = 0;

        while(s1<len1 && s2<len2){
            if(nums1[s1] < nums2[s2]){
                ans[count] = nums1[s1];
                count++;
                s1++;
            }else if(nums1[s1] == nums2[s2]){
                ans[count] = nums1[s1];
                count++;
                ans[count] = nums2[s2];
                count++;
                s1++;
                s2++;
            }else {
                ans[count] = nums2[s2];
                count++;
                s2++;
            }
        }

        while(s1<len1){
            ans[count] = nums1[s1];
            count++;
            s1++;
        }

        while(s2<len2){
            ans[count] = nums2[s2];
            count++;
            s2++;
        }

        int x = 0;
        for(int i : ans){
            nums1[x] = i;
            x++;
        }
    }
}
