package LeetCode.recursion;

public class Count_Good_Numbers {

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }
    public static int countGoodNumbers(long n) {

        if(n==0){
            return 1;
        }
        long even = (n+1)/2;
        long odd = (n)/2;

        int eN = 5;
        int oN = 4;

        long ans = pow(eN, even) * pow(oN, odd) ;
        return (int)(ans%MOD);
    }

    private static long pow(long x, long n){
        if (n==0) return 1;

        long temp = pow(x, n/2);
        if(n%2==0){
            return (temp*temp)% MOD;
        }else {
            return (x*temp*temp)%MOD;
        }
    }


}
