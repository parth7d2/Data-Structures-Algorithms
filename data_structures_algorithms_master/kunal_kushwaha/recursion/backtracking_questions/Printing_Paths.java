package data_structures_algorithms_master.kunal_kushwaha.recursion.backtracking_questions;

import java.util.ArrayList;

public class Printing_Paths {
    public static void main(String[] args) {
        System.out.println(path_printArrDiog("", 3, 3));
    }

    static ArrayList<String> path_print(String ans, int r, int c, ArrayList<String> ansList){
        if(r==1 && c==1){
            ansList.add(ans);
        }

        if(r>1){
            path_print(ans+'V', r-1, c, ansList);
        }
        if(c>1) {
            path_print(ans+'H', r, c-1, ansList);
        }

        return ansList;
    }

    static ArrayList<String> path_printArr(String ans, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> ansList = new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }

        ArrayList<String> List = new ArrayList<>();
        if(r>1){
            List.addAll(path_printArr(ans+'V', r-1, c));
        }
        if(c>1) {
            List.addAll(path_printArr(ans + 'H', r, c - 1));

        }


        return List ;
    }

    static ArrayList<String> path_printArrDiog(String ans, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> ansList = new ArrayList<>();
            ansList.add(ans);
            return ansList;
        }

        ArrayList<String> List = new ArrayList<>();
        if(r>1 && c>1){
            List.addAll(path_printArrDiog(ans+'D', r-1, c-1));
        }
        if(r>1){
            List.addAll(path_printArrDiog(ans+'V', r-1, c));
        }
        if(c>1) {
            List.addAll(path_printArrDiog(ans + 'H', r, c - 1));

        }


        return List ;
    }
}
