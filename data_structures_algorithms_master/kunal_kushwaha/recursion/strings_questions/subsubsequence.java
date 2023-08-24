package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsubsequence {
    public static void main(String[] args) {
        System.out.println(subsetofStringRe("", "abc"));
    }

    static void subsetofString(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subsetofString(p+c, up.substring(1));
        subsetofString(p, up.substring(1));
    }

    static void subsetofStringASCII(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        subsetofStringASCII(p + (c+0), up.substring(1));
        subsetofStringASCII(p + c, up.substring(1));
        subsetofStringASCII(p, up.substring(1));

    }
    static ArrayList<String> subsetofStringRe(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        ArrayList<String> left = subsetofStringRe(p + c, up.substring(1));
        ArrayList<String> right = subsetofStringRe(p, up.substring(1));

        left.addAll(right);
        return left;

    }






}
