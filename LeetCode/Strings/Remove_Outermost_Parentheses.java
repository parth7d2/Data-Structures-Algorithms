package LeetCode.Strings;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        int len = s.length();
        String ans = "";
//        char s1 = '(';
//        char s2 = ')';
        for(int i = 0; i< len-2; i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            char c3 = s.charAt(i+2);
            if((c1 == c2) && (c2 == c3)){
                ans+=c1;
            }else{
                ans+="()";
                i+=2;
            }
        }
//        int i = 0;
//        while (i+2<len){
//            char c1 = s.charAt(i);
//            char c2 = s.charAt(i+1);
//            char c3 = s.charAt(i+2);
//            if(c1 == c2 && c2 == c3 || (c1==s1 && c2 == s2)){
//               if(c1 == s1 && c2 != s2){
//                   ans += "(";
//                   i++;
//               }else if(c2 == s2 && c1 != s1){
//                    ans += ")";
//                    i++;
//               }else if((c1==s1 && c2 == s2)){
//                   ans += "()";
//                   i++;
//               }
//            }else {
//                i++;
//            }
//        }
        return ans;
    }
}
