package LeetCode.recursion;

public class Pow_x_n {
    public static void main(String[] args) {
        double x = 0;
        int n = 1;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
        double ans = x;
        if(n<0){
            n *= -1;
            ans = 1/helper(x, n, ans);
            return ans;
        }
        return helper(x, n, ans);
    }

    public static double helper(double x, int n, double ans) {
        if(n == 1){
            return ans;
        }
        ans *= x;
        return helper(x, n-1, ans);
    }
}
