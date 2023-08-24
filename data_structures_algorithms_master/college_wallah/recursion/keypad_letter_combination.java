package data_structures_algorithms_master.college_wallah.recursion;

import java.util.ArrayList;
import java.util.List;

public class keypad_letter_combination {
    public static void main(String[] args){
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        letterCombinations("23", "", arr);
    }

    static void letterCombinations(String digits, String ans, String[] arr) {
        if(digits.isEmpty()){
            System.out.print(ans+ " ");
            return;
        }

        int a = digits.charAt(0) - '0';
        String s = arr[a];
        for(int i = 0; i<s.length(); i++){
            letterCombinations(digits.substring(1), ans+s.charAt(i), arr);
        }
    }


}
