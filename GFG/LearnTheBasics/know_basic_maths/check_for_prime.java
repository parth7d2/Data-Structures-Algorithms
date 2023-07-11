public class check_for_prime {

    public static void main(String[] args) {
        prime(27);
    }

    static void prime(int n) {
        int count = 1;
        int ans = 0;
        while (count * count <= n) {
            if (n % count == 0) {
                ans++;
                if (n / count != count) {
                    ans++;
                }
            }
            count++;
        }
        if (ans > 2) {
            System.out.println("This is not prime");
        } else {
            System.out.println("This is prime");
        }
    }

}
