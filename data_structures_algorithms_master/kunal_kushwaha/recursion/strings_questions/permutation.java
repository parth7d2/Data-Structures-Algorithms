package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        System.out.println(string_permutationCount("", "abc"));
    }
    static void string_permutation(String ans, String s){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        char c = s.charAt(0);
        for(int i=0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String e = ans.substring(i, ans.length());
            string_permutation(f+c+e, s.substring(1));
        }
    }

    static ArrayList<String> string_permutation2(String ans, String s){
        ArrayList<String> arr = new ArrayList<>();
        if(s.isEmpty()){
            ArrayList<String> as = new ArrayList<>();
            as.add(ans);
            return as;
        }
        char c = s.charAt(0);
        for(int i=0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String e = ans.substring(i, ans.length());
            ArrayList<String> str = string_permutation2(f+c+e, s.substring(1));
            arr.addAll(str);
        }
        return arr;
    }

    static int string_permutationCount(String ans, String s){
        if(s.isEmpty()){
            return 1;
        }
        char c = s.charAt(0);
        int a = 0;
        for(int i=0; i <= ans.length(); i++){
            String f = ans.substring(0, i);
            String e = ans.substring(i, ans.length());
            a = a + string_permutationCount(f+c+e, s.substring(1));
        }
        return a;
    }
}
