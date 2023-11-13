package LeetCode.recursion;

public class String_to_Integer_atoi {
    public static void main(String[] args) {
        String s = "";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        if(s.isEmpty()){
            return -1;
        }
        String ans = "";
        return healper(s, ans);
    }

    public static int healper(String s, String ans) {
        if(s.isEmpty()){
            int no = Integer.parseInt(ans);
            return no;
        }
        int c = s.charAt(0) - '0';
        if(ans.isEmpty() && c == -3){
            ans += "-";
        }else if(c>=0 && c<=9){
            ans += String.valueOf(c);
        }
        return healper(s.substring(1), ans);
    }
}
