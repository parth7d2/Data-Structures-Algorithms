package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pascals_Triangle {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ansList = new ArrayList<>();
        for(int i = 1; i<=numRows; i++){
            ansList.add(generateRow(i));
        }
        return ansList;
    }

    static List<Integer> generateRow(int numRows) {
        List<Integer> rowList = new ArrayList<>();
        int ans = 1;
        rowList.add(ans);
        for(int i = 1; i<numRows; i++){
            ans = ans * (numRows-i);
            ans = ans/i;
            rowList.add(ans);
        }
        return rowList;
    }
}
