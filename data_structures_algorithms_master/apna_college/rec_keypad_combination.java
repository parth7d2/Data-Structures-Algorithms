public class rec_keypad_combination {

    public static void main(String[] args) {
        String s1 = "def";
        String s2 = "ghij";
        combination(s1, s2, 0, "");
    }

    static void combination(String s1, String s2, int idx, String ns) {

        if (idx == s1.length()) {
            return;
        }
        for (int i = 0; i < s2.length(); i++) {
            char c1 = s1.charAt(idx);
            char c2 = s2.charAt(i);
            System.out.println(ns + c1 + c2);
        }
        combination(s1, s2, idx + 1, "");

    }

}
