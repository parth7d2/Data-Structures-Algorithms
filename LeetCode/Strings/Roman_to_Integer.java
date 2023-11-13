package LeetCode.Strings;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int i = 0;
        int len = s.length();
        int ans = 0;
        while (i<len){
            char c = s.charAt(i);
            char c2 = 's';
            if(i<len-1) {
               c2 = s.charAt(i + 1);
            }
            if(c == 'I' && c2 == 'V'){
                ans += 4;
                i+=2;
            }else if(c == 'I' && c2 == 'X'){
                ans += 9;
                i+=2;
            }else if(c == 'X' && c2 == 'L'){
                ans += 40;
                i+=2;
            }else if(c == 'X' && c2 == 'C'){
                ans += 90;
                i+=2;
            }else if(c == 'C' && c2 == 'D'){
                ans += 400;
                i+=2;
            }else if(c == 'C' && c2 == 'M'){
                ans += 900;
                i+=2;
            }else if(c == 'I'){
                ans += 1;
                i++;
            }else if(c == 'V'){
                ans += 5;
                i++;
            }else if(c == 'X'){
                ans += 10;
                i++;
            }else if(c == 'L'){
                ans += 50;
                i++;
            }else if(c == 'C'){
                ans += 100;
                i++;
            }else if(c == 'D'){
                ans += 500;
                i++;
            }else if(c == 'M'){
                ans += 1000;
                i++;
            }
        }
        return ans;
    }
}
