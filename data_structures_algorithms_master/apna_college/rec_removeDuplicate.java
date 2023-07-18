public class rec_removeDuplicate {
    public static void main(String[] args) {
        duplicateRemove("abbccda", 0, "");
    }

    public static boolean[] map = new boolean[26];

    static void duplicateRemove(String s, int idx, String newString) {
        if (idx > s.length() - 1) {
            System.out.println(newString);
            return;
        }
        char c = s.charAt(idx);
        if (map[c - 'a'] == true) {
            duplicateRemove(s, idx + 1, newString);
        } else {
            newString += c;
            map[c - 'a'] = true;
            duplicateRemove(s, idx + 1, newString);
        }
    }

}
