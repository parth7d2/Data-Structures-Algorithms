package LeetCode.recursion;

import LeetCode.Linkedlist.Reverse_Nodes_in_k_Group;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ansS = new ArrayList<>();
        helper(n, 0, 0, "", ansS);
        return ansS;
    }

    public static void helper(int n, int o, int c, String s, List<String> ans){
        if(o==n && c==n){
            ans.add(s);
            return;
        }

        if(o<n){
//            s += "(";
            helper(n, o+1, c, s+"(", ans);
        }
        if(c<o ) {
//            s += ")";
            helper(n, o, c + 1, s+")", ans);
        }

    }
}
