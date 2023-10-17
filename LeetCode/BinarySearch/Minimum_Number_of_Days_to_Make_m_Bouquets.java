package LeetCode.BinarySearch;

public class Minimum_Number_of_Days_to_Make_m_Bouquets {
    public static void main(String[] args) {
        int[] bloomDay = {1,10,3,10,2};
        System.out.println(minDays(bloomDay, 3, 1));
    }

    static int minDays(int[] bloomDay, int m, int k) {
      long total = (long) m*k;
      int len = bloomDay.length;
      if(len<total)
          return -1;
      int min = Integer.MAX_VALUE, max = 0;
      for(int i = 0 ; i<len; i++){
          min = Math.min(bloomDay[i], min);
          max = Math.max(bloomDay[i], max);
      }

      int s = min, e = max;
      while(s<=e){
          int mid = s + (e-s)/2;
          if(possible(bloomDay, mid, m, k)){
              e = mid-1;
          }else {
              s = mid+1;
          }
      }
      return s;

    }

    static boolean possible(int[] bloomDay, int day, int m, int k){
        int no = 0;
        int count = 0;
        for(int i = 0; i<bloomDay.length; i++){
            if(bloomDay[i] <= day){
                count++;
            }else {
                no += (count/k);
                count = 0;
            }
        }
        no += (count/k);
        return no >= m;
    }


}
