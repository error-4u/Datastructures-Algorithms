package Algorithms.Backtracking;

public class Obstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        obs(board, "", 0, 0);
    }

    static void obs(boolean[][] board, String p, int r, int c ){
        if( r == board.length-1 &&  c == board[0].length-1){
            System.out.println(p);
            return;
        }

        if (!board[r][c]){
            return;
        }

        if(r < board.length-1){
            obs(board, p +"D", r+1, c);
        }
        if (c < board[0].length-1){
            obs(board, p+"R", r, c+1);
        }
    }
}

