public class rec_reverse {
    public static void main(String[] args) {
        // System.out.println(reverse("Hello"));
        // System.out.println(rec_reverses("Hello", 0, "Hello".length() - 1));
        String s = "Hello";
        rec_reverse2(s, s.length() - 1);
    }

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = sb.length() - 1;
        while (start < end) {
            char temp = sb.charAt(end);
            sb.setCharAt(end, sb.charAt(start));
            sb.setCharAt(start, temp);
            start++;
            end--;
        }
        return s = sb.toString();
    }

    static String rec_reverses(String s, int start, int end) {
        StringBuilder sb = new StringBuilder(s);
        if (start >= end) {
            return s;
        }
        char temp = sb.charAt(end);
        sb.setCharAt(end, sb.charAt(start));
        sb.setCharAt(start, temp);
        s = sb.toString();
        return rec_reverses(s, ++start, --end);
    }

    static void rec_reverse2(String s, int index) {
        if (index == 0) {
            System.out.print(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index));
        rec_reverse2(s, --index);
    }
}
