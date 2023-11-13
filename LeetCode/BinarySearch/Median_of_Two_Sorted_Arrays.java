package LeetCode.BinarySearch;

public class Median_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;

        int[] arr = new int[l1+l2];
        int s1 = 0, s2 =0;
        int count = 0;
        while(s1<l1 && s2<l2){
            if(nums1[s1] <= nums2[s2]){
                arr[count] = nums1[s1];
                count++;
                s1++;
            }else{
                arr[count] = nums2[s2];
                count++;
                s2++;
            }
        }
        while(s1<l1){
            arr[count] = nums1[s1];
            count++;
            s1++;
        }
        while (s2<l2){
            arr[count] = nums2[s2];
            count++;
            s2++;
        }

        if(arr.length%2 == 1){
            return arr[arr.length/2];
        }else {
            double ans = ((double)arr[arr.length/2] + (double)arr[arr.length/2 - 1])/2 ;
            return ans;
        }
    }
}
