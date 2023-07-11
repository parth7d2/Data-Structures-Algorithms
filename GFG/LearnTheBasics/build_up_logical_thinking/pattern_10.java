package build_up_logical_thinking;

public class pattern_10 {
    public static void main(String[] args) {
        pattern(3);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
