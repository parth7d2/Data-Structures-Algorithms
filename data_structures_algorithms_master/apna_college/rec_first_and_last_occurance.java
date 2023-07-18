public class rec_first_and_last_occurance {
    public static void main(String[] args) {
        String s = "abaacdaefaah";
        first_last(s, s.length() - 1);
    }

    static int first = -1;
    static int last = -1;

    static void first_last(String str, int index) {
        if (index < 0) {
            System.out.println("First: " + first + " Last: " + last);
            return;
        }
        if (str.charAt(index) == 'a') {
            if (last == -1) {
                last = index;
            } else {
                first = index;
            }
        }

        first_last(str, --index);
    }
}