public class rec_Factorial_of_N_num {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    static int factorial(int n) {
        if (n < 2) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

}
