package build_up_logical_thinking;

public class pattern_14 {
    public static void main(String[] args){
        pattern(5);
    }

    static void pattern(int a){
        for(int i = 1; i<= a; i++){
            char c = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}
