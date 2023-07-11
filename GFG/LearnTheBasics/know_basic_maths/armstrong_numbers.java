public class armstrong_numbers {
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }

    static boolean armstrong(int num) {

        int n = num;
        int total = 0;
        while (n > 0) {
            int a = n % 10;
            total += a * a * a;
            n /= 10;
        }
        if (total == num) {
            return true;
        }
        return false;
    }

}
