package build_up_logical_thinking;

public class pattern_1 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
