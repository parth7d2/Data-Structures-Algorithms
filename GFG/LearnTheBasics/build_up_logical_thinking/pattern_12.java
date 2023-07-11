package build_up_logical_thinking;

public class pattern_12 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j != i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            for (int k = (n - i) * 2; k >= 1; k--) {
                System.out.print("  ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(" " + l);
            }
            System.out.println();
        }
    }

}
