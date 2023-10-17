package data_structures_algorithms_master.kunal_kushwaha.recursion.backtracking_questions;

public class Counting_Paths {
    public static void main(String[] args) {
        System.out.println(howmanyPaths(3,3));
    }

    static int howmanyPaths(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = howmanyPaths(r-1, c);
        int right = howmanyPaths(r, c-1);

        return left+right;
    }
}
