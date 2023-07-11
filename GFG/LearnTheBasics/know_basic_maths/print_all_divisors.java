import java.util.ArrayList;
import java.util.Collections;

public class print_all_divisors {

    public static void main(String[] args) {
        System.out.println(divisors(36));
    }

    static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 1;
        while (count * count <= n) {
            if (n % count == 0) {
                arr.add(count);
                if (n / count != count) {
                    arr.add(n / count);
                }
            }
            count++;
        }

        Collections.sort(arr);

        return arr;
    }

}
