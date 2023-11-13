package LeetCode.Bit_Manipulation;

public class Divide_Two_Integers {
    public static void main(String[] args) {
        int c = -2147483648/-1;
        System.out.println(c);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }else if(dividend == Integer.MAX_VALUE){

        }
        int ans = dividend/divisor;
        return ans;
    }
}
