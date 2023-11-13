package LeetCode.BinarySearch;

public class Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        System.out.println(searchMatrix(matrix, 5));
    }

    // ############## Bruteforce Solution ##############

//    static boolean searchMatrix(int[][] matrix, int target) {
//        int len = matrix.length;
//        int ilen = matrix[0].length;
//        for(int i=0; i<len; i++){
//            for(int j = 0; j<ilen; j++){
//              if(matrix[i][j] == target){
//                  return true;
//              }
//              if(matrix[i][j] > target){
//                  break;
//              }
//            }
//        }
//        return false;
//    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int s = 0, e = m-1;
        while (s < n && e >= 0){
            if(matrix[s][e] == target){
                return true;
            } else if (matrix[s][e] > target) {
                e--;
            }else {
                s++;
            }
        }
        return false;
    }
}
