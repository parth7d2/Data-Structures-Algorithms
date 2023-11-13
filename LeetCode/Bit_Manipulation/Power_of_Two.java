package LeetCode.Bit_Manipulation;

public class Power_of_Two {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }

    static boolean isPowerOfTwo(int n) {
        int no = n;
        int count = 0;
            while (n != 0) {
                if(n%2 == 0) {
                    n = n/2;
                    count++;
                }else {
                    break;
                }
            }
            if(Math.pow(2, count)==no){
                return true;
            }else {
                return false;
            }
    }
}
