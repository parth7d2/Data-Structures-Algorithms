package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class patternQuestions {
    public static void main(String[] args) {
        pattern1(5, 0);
        pattern2(5, 0);

    }

    static void pattern1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            pattern1(r, c + 1);
        } else {
            if (r != 0) System.out.println();
            pattern1(r-1, 0);
        }
    }
    static void pattern2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            pattern2(r, ++c);
            System.out.print("*");
        } else {
            c = 0;
            pattern2(--r, c);
            if (r != 0) {
                System.out.println();
            }
        }
    }

}