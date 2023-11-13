package LeetCode.BinarySearch;

public class Capacity_To_Ship_Packages_Within_D_Days {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(weights, 5));
    }
    static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : weights){
            max = Math.max(max, i);
            sum += i;
        }

        int s = max;
        int e = sum;

        while(s<=e){
            int mid = s + (e-s)/2;
            int capdays = capacity(weights, days, mid);
            if(capdays<=days){
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return s;
    }

    static int capacity(int[] weights, int days, int cap) {
        int len = weights.length;
        int capdays = 1, load = 0;
        for(int i = 0; i<len; i++){
            if(load+weights[i] >cap){
                capdays += 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return capdays;
    }
}
