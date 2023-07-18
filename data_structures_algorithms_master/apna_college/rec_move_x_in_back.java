public class rec_move_x_in_back {
    public static void main(String[] args) {
        String s = "axbcxxd";
        move(s, 'x', 0);
    }

    static int count = 0;
    static StringBuilder sb = new StringBuilder();

    static void move(String s, char c, int l) {
        if (l > s.length() - 1) {
            for (int i = 0; i < count; i++) {
                sb.append(c);
            }
            System.out.print(sb);
            return;
        }
        if (s.charAt(l) == c) {
            count++;
        } else {
            sb.append(s.charAt(l));
        }

        move(s, c, l + 1);

    }

}
