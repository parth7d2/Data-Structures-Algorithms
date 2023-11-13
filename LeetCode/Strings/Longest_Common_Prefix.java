package LeetCode.Strings;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

//    static String longestCommonPrefix(String[] strs) {
//        String minS = "";
//        int min = 0;
//        int l = strs.length;
//        if(l==1){
//            return strs[0];
//        }
//        for(int i = 0; i<l; i++){
//            String s = strs[i];
//            if(s.length() > minS.length()){
//                minS = s;
//                min = i;
//            }
//        }
//        String ans = "";
//        int len = minS.length();
//        int low = 0;
//        int high = len-1;
//        String temp = "";
//        while (low < high){
//            char c = minS.charAt(low);
//            if(other(strs, temp+c)){
//                temp += c;
//                low++;
//            }else {
//                low++;
//                temp = "";
//            }
//            if(ans.length() < temp.length()){
//                ans = temp;
//            }
//        }
//        return ans;
//    }

//    static boolean other(String[] strs, String c){
//        int len = strs.length;
//        boolean type = false;
//        for(int i = 0; i<len; i++){
//            if(strs[i].contains(c)){
//                type = true;
//            }else {
//                return false;
//            }
//        }
//        return type;
//    }

    static String longestCommonPrefix(String[] strs) {
        String minS = strs[0];
        int l = strs.length;
        if(l==1){
            return strs[0];
        }
        for(int i = 0; i<l; i++){
            String s = strs[i];
            if(s.length() < minS.length()){
                minS = s;
            }
        }
        String ans = "";
        int len = minS.length();
        int low = 0;
        int high = len-1;
        String temp = "";
        int count = 0;
        while (low <= high){
            char c = minS.charAt(low);
            if(other(strs, c, count)){
                temp += c;
                low++;
                count++;
                if(ans.length() < temp.length()){
                    ans = temp;
                }
            }else {
                return ans;
            }

        }
        return ans;
    }

    static boolean other(String[] strs, char c, int count){
        int len = strs.length;
        boolean type = false;
        for(int i = 0; i<len; i++){
            if(strs[i].charAt(count) == c){
                type = true;
            }else {
                return false;
            }
        }
        return type;
    }
}
