package LeetCode.Strings;

import java.util.ArrayList;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "  a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        ArrayList<String> anslist = new ArrayList<>();
        String st = "";
        String ans = helper(s, anslist, st);
        int len = anslist.size()-1;
        for(int i = len; i>=0; i--){
            st += anslist.get(i);
            if(i!=0){
                st += " ";
            }
        }
        return st;
    }

    public static String helper(String s, ArrayList<String> ans, String st) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                if (st.length() != 0) {
                    ans.add(st);
                    st = "";
                }
                i++;
            } else {
                st += s.charAt(i);
                i++;
            }
        }
        if(st.length()!=0){
            ans.add(st);
        }
        return st;
    }


}
