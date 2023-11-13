package LeetCode.BinarySearch;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1}};
        System.out.println(searchMatrix(matrix, 3));

    }

    //############## Bruteforce Solution ####################
//    static boolean searchMatrix(int[][] matrix, int target) {
//        int len = matrix[0].length-1;
//        for(int i = 0; i<matrix.length; i++){
//            if(matrix[i][len] >= target){
//                return binarySerch(matrix[i], target);
//            }
//        }
//        return false;
//    }
//
//    static boolean binarySerch(int[] matrix, int target){
//        int s = 0;
//        int e = matrix.length-1;
//        while (s<=e){
//            int mid = s+(e-s)/2;
//            if(matrix[mid] == target){
//                return true;
//            }else if(matrix[mid] > target){
//                e = mid-1;
//            }else{
//                s = mid+1;
//            }
//        }
//        return false;
//    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length * matrix[0].length - 1;

        int colLen = matrix[0].length;



        while (s<=e){
            int mid = s + (e - s) / 2;
            int row = mid / colLen;
            int col = mid % colLen;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}
