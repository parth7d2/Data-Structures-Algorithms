package LeetCode.Strings;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int ans = 0;
        int count = 0;
        boolean pair = false;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                count++;
            }
            if(c == ')'){
                ans = Math.max(ans, count);
                count -= 1;
            }
        }
        return ans;
    }
}
