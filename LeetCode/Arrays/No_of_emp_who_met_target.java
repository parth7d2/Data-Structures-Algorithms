package LeetCode.Arrays;

public class No_of_emp_who_met_target {
    public static void main(String[] args) {
        int[] hours = {5,1,4,2,2};
        System.out.println(numberOfEmployeesWhoMetTarget(hours, 3));
    }

    static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i = 0; i<hours.length; i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
}
