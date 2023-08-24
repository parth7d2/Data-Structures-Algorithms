package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

public class phone_alpha {
    public static void main(String[] args) {
        num_alpha("",  "12");
    }

    static void num_alpha(String p, String str){

        if(str.isEmpty()){
            System.out.print(p + " ");
            return;
        }

        int a = str.charAt(0) - '0';
        for(int i = (a - 1) * 3; i<a*3; i++){
            char c = (char) ('a'+ i);
            num_alpha(p+c, str.substring(1));
        }


    }
}
