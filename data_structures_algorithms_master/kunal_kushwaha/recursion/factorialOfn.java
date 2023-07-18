package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class factorialOfn {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
