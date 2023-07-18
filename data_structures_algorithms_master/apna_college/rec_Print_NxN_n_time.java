public class rec_Print_NxN_n_time {
    public static void main(String[] args) {
        System.out.println(nLogN(2, 5));
    }

    static int nXnTime(int n, int x) {
        if (x < 1) {
            return 1;
        }
        return nXnTime(n, x - 1) * n;
    }

    static int nLogN(int n, int x) {
        if (x == 0) {
            return 1;
        }
        if (x % 2 == 0)
            return nLogN(n, x / 2) * nLogN(n, x / 2);
        else
            return nLogN(n, x / 2) * nLogN(n, x / 2) * n;
    }

}
