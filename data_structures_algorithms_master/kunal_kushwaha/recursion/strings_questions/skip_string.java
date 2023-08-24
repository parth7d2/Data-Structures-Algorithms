package data_structures_algorithms_master.kunal_kushwaha.recursion.strings_questions;

public class skip_string {
    public static void main(String[] args) {
        System.out.println(skipString("sdfappleHello", "apple"));
        System.out.println(skipAppNotApple("sdfapplHello", "app"));
    }

    static String  skipString(String s, String skip){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(skip)){
            return skipString(s.substring(skip.length()), skip);
        }else {
            return s.charAt(0) + skipString(s.substring(1) , skip);
        }
    }

    static String skipAppNotApple(String s, String skip){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith(skip) && !s.startsWith("apple")){
            return skipAppNotApple(s.substring(skip.length()), skip);
        }else {
            return s.charAt(0) + skipAppNotApple(s.substring(1), skip);
        }
    }
}
