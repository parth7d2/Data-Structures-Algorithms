public class count_digits {
    public static void main(String[] args) {
        count(480);
    }

    static void count(int n) {
        int no = 0;
        while (n > 0) {
            no++;
            n = n / 10;
        }
        System.out.println(no);
    }

}