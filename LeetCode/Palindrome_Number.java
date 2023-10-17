package LeetCode;

public class Palindrome_Number {
    public static void main(String[] args) {
        int x = -10;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        boolean result = false;
        String s = String.valueOf(x);
        int i = 0;
        int j = s.length()-1;

        if(j==0){
            return true;
        }
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                result = true;
                i++;
                j--;
            }else {
                return false;
            }
        }

        return result;
    }
}
