package LeetCode;

public class first_Occureence {
    public static void main(String[] args) {

    }

    static int firstOccureence(String haystack, String needle) {
        if (haystack.startsWith(needle)) {
            return 0;
        } else if (haystack.indexOf(needle) != -1) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }
    }
}