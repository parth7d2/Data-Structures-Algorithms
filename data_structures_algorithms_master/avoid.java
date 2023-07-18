import java.util.HashMap;

public class avoid{

    public static void main(String[] args) {
        System.out.println(stringChallenge("abcabc")); // 2
        System.out.println(stringChallenge("cccc")); // 4
        System.out.println(stringChallenge("baccabcbc")); // 1
    }

    private static final HashMap<String, String> replacements = new HashMap<>();

    static {
        replacements.put("ab", "c");
        replacements.put("ac", "b");
        replacements.put("bc", "a");
        replacements.put("ba", "c");
        replacements.put("ca", "b");
        replacements.put("cb", "a");
    }

    public static int stringChallenge(String str) {
        String original = str;
        while (!original.equals(str)) {
            for (String replacement : replacements.keySet()) {
                if (str.contains(replacement)) {
                    str = str.replace(replacement, replacements.get(replacement));
                    break;
                }
            }
        }
        return str.length();
    }

    // public static int stringChallenge(String str) {
    // int length = str.length();
    // while (true) {
    // int index = 0;
    // while (index < length - 1) {
    // if (str.charAt(index) != str.charAt(index + 1)) {
    // String replacement = "";
    // if (str.charAt(index) == 'a' && str.charAt(index + 1) == 'b') {
    // replacement = "c";
    // } else if (str.charAt(index) == 'b' && str.charAt(index + 1) == 'c') {
    // replacement = "a";
    // } else if (str.charAt(index) == 'c' && str.charAt(index + 1) == 'a') {
    // replacement = "b";
    // }
    // if (replacement.length() > 0) {
    // str = str.substring(0, index) + replacement + str.substring(index + 2);
    // length = str.length();
    // break;
    // }
    // }
    // index++;
    // }
    // if (index == length - 1) {
    // break;
    // }
    // }
    // return length;
    // }

    // public static void main(String[] args) {
    // System.out.println(stringChallenge("cab")); // 2
    // System.out.println(stringChallenge("bcab")); // 1
    // }

    // SELECT
    // MONTH(signup_date) AS month,
    // signups - COALESCE(LAG(signups) OVER (ORDER BY signup_date), 0) AS
    // month_to_month_change
    // FROM maintable_8PIOA
    // GROUP BY MONTH(signup_date)
    // ORDER BY signup_date;

    // public static String MatrixChallenge(String[] strarr) {
    // // Initialize the queens array.
    // int[][] queens = new int[8][2];
    // for (int i = 0; i < 8; i++) {
    // String queen = strarr[i];
    // int x = Integer.parseInt(queen.substring(1, 2));
    // int y = Integer.parseInt(queen.substring(3));
    // queens[i][0] = x;
    // queens[i][1] = y;
    // }

    // // Check if any of the queens are attacking each other.
    // for (int i = 0; i < 8; i++) {
    // for (int j = i + 1; j < 8; j++) {
    // if (queens[i][0] == queens[j][0] || queens[i][1] == queens[j][1]
    // || Math.abs(queens[i][0] - queens[j][0]) == Math.abs(queens[i][1] -
    // queens[j][1])) {
    // return String.format("(%d,%d)", queens[i][0], queens[i][1]);
    // }
    // }
    // }

    // // No queens are attacking each other.
    // return "true";
    // }

    // def ArrayChallenge(strArr):
    // parents = {}
    // for pair in strArr:
    // i1, i2 = pair.split(',')
    // parents[i2] = i1

    // for i in parents:
    // if i not in parents.values():
    // return 'true'
    // return 'false'

}
