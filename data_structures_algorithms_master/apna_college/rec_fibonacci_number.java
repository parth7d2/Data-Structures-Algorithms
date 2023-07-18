public class rec_fibonacci_number {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    static int fibo(int n) {
        if (n < 2) {
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        return fibo(n - 2) + fibo(n - 1);
    }
}