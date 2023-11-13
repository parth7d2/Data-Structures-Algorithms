package LeetCode.BinarySearch;

import java.util.Arrays;

public class Find_a_Peak_Element_II {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4,5,6,7,8}, {2,3,4,5,6,7,8,9}, {3,4,5,6,7,8,9,10},{4,5,6,7,8,9,10,11}};

        System.out.println(Arrays.toString(findPeakGrid(mat)));

    }
    static int[] findPeakGrid(int[][] mat) {
        int s = 0;
        int e = mat[0].length-1;
        int[] ans = new int[2];
        while (s<=e){
            int mid = s + (e - s)/2;
            int MaxNo = MaximumNo(mat, mid);
            int left = -1;
            if(mid>0){
                left = mat[MaxNo][mid-1];
            }
            int right = -1;
            if(mid+1<mat[0].length){
                right = mat[MaxNo][mid+1];
            }
            if(mat[MaxNo][mid] > left && mat[MaxNo][mid] > right){
                ans[0] = MaxNo;
                ans[1] = mid;
                return ans;
            }else if(mat[MaxNo][mid] < right){
                s = mid+1;
            }else {
                e = mid-1;
            }
        }
        ans[0] = -1;
        ans[1] = -1;
        return ans;
    }

    static int MaximumNo(int[][] mat, int mid){
        int max = Integer.MIN_VALUE;
        int len = mat.length;
        int ans = -1;
        for(int i = 0; i<len; i++){
            if(max < mat[i][mid]){
                max = mat[i][mid];
                ans = i;
            }
        }
        return ans;
    }
}
