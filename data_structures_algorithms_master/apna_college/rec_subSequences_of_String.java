public class rec_subSequences_of_String {
    public static void main(String[] args) {
        subStirng("abc", 0, "");
    }

    static void subStirng(String s, int idx, String newString) {
        if (idx > s.length() - 1) {
            System.out.println(newString);
            return;
        }
        char c = s.charAt(idx);
        // add
        subStirng(s, idx + 1, newString + c);
        // not add
        subStirng(s, idx + 1, newString);
    }

}
