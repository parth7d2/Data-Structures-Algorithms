import java.util.HashSet;

public class rec_unique_subString {
    public static void main(String[] args) {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqString(s, 0, "", set);

    }

    static void uniqString(String s, int idx, String newString, HashSet<String> set) {

        if (idx == s.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char c = s.charAt(idx);

        uniqString(s, idx + 1, newString + c, set);

        uniqString(s, idx + 1, newString, set);

    }

}
