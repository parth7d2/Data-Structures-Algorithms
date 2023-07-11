package things_to_know;

import java.util.ArrayList;

public class string {

    public static void main(String[] args) {
        String a = "Striver";
        char[] c = a.toCharArray();
        c[c.length - 1] = 'z';
        System.out.println(new String(c));

        // or
        StringBuilder sb = new StringBuilder(a);
        sb.setCharAt(sb.length() - 1, 'z');
        System.out.println(sb);
    }
}
