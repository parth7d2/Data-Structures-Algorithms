package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class digit_product {
    static int prod(int n) {
        if (n % 10 == n) {
            return 1;
        }
        return prod(n / 10) * (n % 10);
    }

    public static void main(String[] args) {
        System.out.println(prod(1342));
    }

}
