import java.util.Arrays;
import java.util.Scanner;

public class avoid {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        // INPUT
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // for (int[] a : arr) {
        // for (int b : a) {
        // b = sc.nextInt();
        // }
        // }

        // OUTPUT

        // System.out.println("{");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print("{");
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + ", ");
        // }
        // System.out.print("}");
        // System.out.println();
        // }
        // System.out.println("}");

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}