package things_to_know;

public class if_else {
    public static void main(String[] args) {

    }

    static String compareNM(int n, int m) {
        if (n == m) {
            return "equal";
        } else if (n < m) {
            return "lesser";
        } else {
            return "greater";
        }
    }

}