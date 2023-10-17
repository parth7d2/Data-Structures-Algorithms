package LeetCode.Arrays;

import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    // brute force

//    static void rotate(int[][] matrix){
//        int row = matrix.length;
//        int col = matrix[0].length;
//        int[][] ansMat = new int[row][col];
//
//        for(int i = 0; i<row; i++){
//            for(int j = 0; j<col; j++){
//                ansMat[j][(row-1)-i] = matrix[i][j];
//            }
//        }
//
//        for(int i = 0; i< ansMat.length; i++){
//            for(int j = 0; j<ansMat[i].length; j++){
//                matrix[i][j] = ansMat[i][j];
//            }
//        }
//    }

    //optimize

    static void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < col; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][(row-1)-j];
                matrix[i][(row-1)-j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
