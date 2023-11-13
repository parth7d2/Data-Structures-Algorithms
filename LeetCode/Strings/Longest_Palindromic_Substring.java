package LeetCode.Strings;

public class Longest_Palindromic_Substring {
    public static void main(String[] args) {
        String s = "babadada";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        int len = s.length()-1;
        int ansLen = 0;
        String ans = "";
        for(int i = 0; i<=len-1; i++){
            char c = s.charAt(i);
            for(int j = i+1; j<=len; j++){
                if(c == s.charAt(j)){
                    String check = s.substring(i, j+1);
                    String revCheck = helper(check, "", check.length());
                    if(check.equals(revCheck)){
                        if(ansLen<=check.length()){
                            ans = check;
                        }
                        ansLen = Math.max(ansLen, check.length());
                    }
                }
            }

        }
        return  ans;
    }

    public static String helper(String s, String rev, int len) {
        for(int i = len-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }
}
