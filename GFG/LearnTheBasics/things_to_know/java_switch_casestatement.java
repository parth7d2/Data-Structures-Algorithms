package things_to_know;

import java.util.ArrayList;
import java.util.List;

public class java_switch_casestatement {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        System.out.println(switchCase(1, arr));
    }

    static double switchCase(int choice, List<Integer> arr) {
        // code here
        double c = 0;
        switch (choice) {
            case 1:
                c = Math.PI * Math.pow(arr.get(0), 2);
                break;
            case 2:
                c = arr.get(0) * arr.get(1);
                break;

            default:
                c = 0;
        }
        return c;
    }
}