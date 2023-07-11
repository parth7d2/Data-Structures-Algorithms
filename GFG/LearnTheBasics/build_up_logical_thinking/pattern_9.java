package build_up_logical_thinking;

public class pattern_9 {
    public static void main(String[] args) {
        pattern(4);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i + 1; k >= 1; k--) {
                System.out.print("*");
            }
            for (int l = n - i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
