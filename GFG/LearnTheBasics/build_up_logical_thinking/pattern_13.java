package build_up_logical_thinking;

public class pattern_13 {
    public static void main(String[] args){
        pattern(5);
    }

    static void pattern(int n){
        int count = 0;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= i; j++){
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
