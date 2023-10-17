import java.util.ArrayList;
import java.util.Arrays;

public class xyz {
    public static void main(String[] args) {
        String st = "abc";
//        System.out.println(skipCharacter(st));
        System.out.println(subString(st,""));
    }

    static String skipCharacter(String st, String ans){
        if(st.isEmpty()){
            return ans;
        }
        if(st.charAt(0) != 'a'){
            return skipCharacter(st.substring(1), ans+st.charAt(0));
        }else{
            return skipCharacter(st.substring(1),ans);
        }
    }
    static String skipCharacter(String st){
        if(st.isEmpty()){
            return "";
        }
        if(st.charAt(0) != 'a'){
            return st.charAt(0) + skipCharacter(st.substring(1));
        }else{
            return skipCharacter(st.substring(1));
        }
    }
    static ArrayList<String> subString(String st, String ans){
        if(st.isEmpty()){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(ans);
            return arr;
        }
        ArrayList<String> arrL = subString(st.substring(1), ans + st.charAt(0));
        ArrayList<String> arrR = subString(st.substring(1) , ans);
        arrL.addAll(arrR);
        return arrL;
    }

}
