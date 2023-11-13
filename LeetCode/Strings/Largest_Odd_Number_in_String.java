package LeetCode.Strings;

public class Largest_Odd_Number_in_String {
    public static void main(String[] args) {
        String s = "100";
        System.out.println(largestOddNumber(s));
    }

    static String largestOddNumber(String num) {
        int len = num.length();
        int ch = (int)num.charAt(len-1)-'0';
        if(ch%2 != 0){
            return num;
        }
        for(int i = len-1; i>=0; i--){
            int c = (int)num.charAt(i)-'0';
            if(c%2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
