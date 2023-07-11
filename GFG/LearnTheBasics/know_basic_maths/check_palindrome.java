public class check_palindrome {

    public static void main(String[] args) {
        palidrome(153);
    }

    static void palidrome(int n) {
        int num = n;
        int ans = 0;
        while (num > 0) {
            int a = num % 10;
            ans = ans * 10 + a;
            num /= 10;
        }
        if (ans == n) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
