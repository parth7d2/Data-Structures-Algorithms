public class reverse_a_number {
    public static void main(String[] args) {
        System.out.println(reverse(7789354));
    }

    static int reverse(int n) {

        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return ans;
    }
}