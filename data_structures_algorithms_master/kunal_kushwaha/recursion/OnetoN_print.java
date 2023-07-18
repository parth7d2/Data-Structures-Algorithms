package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class OnetoN_print {

    public static void main(String[] args) {
        OneToN(5);
    }

    static void OneToN(int n) {
        if (n == 0) {
            return;
        }
        OneToN(n - 1);
        System.out.print(n);
    }

}
