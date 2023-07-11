package learn_basic_recursion;

import java.sql.SQLOutput;
import java.util.Locale;

import static java.lang.Character.toLowerCase;

public class palindrome_string {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcddcba"));
    }
//

    static int start = 0;
    static int end ;
    static int count = 0;

    static int isPalindrome(String S) {

        end = S.length() - 1 - count;
        if (start < end) {
            if (toLowerCase(S.charAt(start)) != toLowerCase(S.charAt(end))) {
                return 0;
            } else {
                start++;
                count++;
            }
            return isPalindrome(S);
        }
        return 1;

    }
}
