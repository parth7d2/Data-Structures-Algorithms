package data_structures_algorithms_master.kunal_kushwaha.recursion;

public class concept {

    public static void main(String[] args) {
        subFirst(5);
    }

    static void subFirst(int n) {
        if (n <= 0) {
            return;
        }
        // subFirst(n--) //false
        // subFirst(--n); // true
        // subFirst(n-1); // true
        System.out.print(n);
    }

}
