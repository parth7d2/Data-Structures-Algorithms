package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class reverse {
    public static void main(String[] args) {
        System.out.print(reverse(1342));
    }

    static int reverse(int n) {
        if (n == 0) {
            return 0;
        }
        return reverse(n / 10) * 10 + (n % 10);
    }
}
