package data_structures_algorithms_master.kunal_kushwaha.recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String st = "abc";
        showPermutaion(st, "");

    }

    static void showPermutaion(String st, String ans){
        if(st.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        int len = ans.length();
        char ch = st.charAt(0);

        for(int i = 0; i<=len; i++){
            String first = ans.substring(0,i);
            String second = ans.substring(i,len);
            showPermutaion(st.substring(1), first+ch+second);
        }
    }
}
