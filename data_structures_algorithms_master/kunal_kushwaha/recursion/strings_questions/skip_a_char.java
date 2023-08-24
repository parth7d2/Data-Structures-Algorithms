package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

public class skip_a_char {
    public static void main(String[] args){
        String s = "baccad";
//        skip(s, 'a', "");
        System.out.println(skip(s));
    }

    static void skip(String s, char ch, String newS){
        if(s.isEmpty()){
            System.out.println(newS);
            return;
        }

        char c = s.charAt(0);
        if(c == ch){
            skip(s.substring(1), ch, newS);
        }else {
            skip(s.substring(1), ch, newS+c);
        }
//        StringBuilder str = new StringBuilder("");
//        System.out.println(helper(s,ch,str,0));

    }

    static String skip(String s){
        if(s.isEmpty()){
            return "";
        }

        char c = s.charAt(0);
        if(c == 'a'){
            return skip(s.substring(1));
        }else {
            return c + skip(s.substring(1));
        }
//        StringBuilder str = new StringBuilder("");
//        System.out.println(helper(s,ch,str,0));

    }


//    ******************** Method 1 *********************************
    static StringBuilder helper(String s, char ch, StringBuilder str, int i){
        if(i == s.length()){
            return str;
        }

        if(s.charAt(i) != ch){
            str.append(s.charAt(i));
        }

        return helper(s, ch, str, i+1);

    }



}
