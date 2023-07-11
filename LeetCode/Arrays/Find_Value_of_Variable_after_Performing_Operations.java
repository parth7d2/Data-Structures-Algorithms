package LeetCode.Arrays;

public class Find_Value_of_Variable_after_Performing_Operations {
    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(operations));

    }

    static int finalValueAfterOperations(String[] operations) {
        int total = 0;
        int length = operations.length;
        for (String s : operations) {
            if (s.equals("--X")) {
                --total;
            } else if (s.equals("X++")) {
                total++;
            } else if (s.equals("++X")) {
                ++total;
            } else if (s.equals("X--")) {
                total--;
            }
        }
        return total;
    }
}
