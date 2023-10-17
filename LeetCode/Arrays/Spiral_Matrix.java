package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Spiral_Matrix {
    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.println(spiralOrder(mat));
    }

    static List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        List<Integer> ansList = new ArrayList<Integer>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                ansList.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ansList.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ansList.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ansList.add(matrix[i][left]);
                }
                left++;
            }

        }
        return ansList;
    }
}
