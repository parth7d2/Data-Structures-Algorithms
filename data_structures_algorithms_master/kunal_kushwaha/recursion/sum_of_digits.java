package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class sum_of_digits {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        System.out.println(sum(1342));
    }

}
