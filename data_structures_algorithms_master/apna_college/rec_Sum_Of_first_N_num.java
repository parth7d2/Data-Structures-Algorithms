public class rec_Sum_Of_first_N_num {

    public static void main(String[] args) {
        System.out.println(sumFirstN(5, 0));
    }

    public static int sumFirstN(int n, int sum) {
        // Write Your Code Here
        if (n == 0) {
            return sum;
        }
        sum += n;
        return sumFirstN(n - 1, sum);
    }

}
