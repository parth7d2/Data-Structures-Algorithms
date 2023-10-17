package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] nums  = {{1,4}, {0,4}};
        int[][] an = merge(nums);
        for(int[] i : an){
            System.out.println(Arrays.toString(i));
        }
    }

    static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        List<List<Integer>> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0; i<n; i++){
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)){
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }else{
                ans.get(ans.size() - 1).set(1,
                        Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }
        int len = ans.size();
        int[][] answer = new int[len][2];
        for(int i = 0; i<len; i++){
            for(int j = 0; j<answer[i].length; j++){
                answer[i][j] = ans.get(i).get(j);
            }
        }

        return answer;
    }
}
