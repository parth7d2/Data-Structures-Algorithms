package data_structures_algorithms_master.kunal_kushwaha.recursion.backtracking_questions;

public class Maze_with_Obstacles {
    public static void main(String[] args){
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        Obstacles("", board, 0, 0);
    }

    static void Obstacles(String ans, boolean[][] maze, int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(ans);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            Obstacles(ans+'V', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            Obstacles(ans+'H', maze, r, c+1);
        }
    }
}
