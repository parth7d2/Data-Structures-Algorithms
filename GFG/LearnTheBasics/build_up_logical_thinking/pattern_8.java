package build_up_logical_thinking;

public class pattern_8 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k >= 0; k--) {
                System.out.print("*");
            }
            for (int l = n - i; l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
