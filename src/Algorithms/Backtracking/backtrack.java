package Algorithms.Backtracking;

public class backtrack {
    public static void main(String[] args) {
        boolean board[][] = {
                {true,true, true },
                {true,true, true },
                {true,true, true }
        };
        backtrack("", board, 0, 0);

    }
    static void backtrack(String p, boolean borad[][], int r, int c){
        if(r == borad.length-1 && c == borad[0].length-1){
            System.out.println(p);
            return;
        }
        if(!borad[r][c]){
            return;
        }
        borad[r][c] = false;

        if(r < borad.length-1){
            backtrack(p+  "D", borad, r+1, c);
        }
        if(c < borad[0].length-1){
            backtrack(p+  "R", borad, r, c+1);
        }
        if(c > 0){
            backtrack(p+  "L", borad, r, c-1);
        }
        if(r > 0){
            backtrack(p+  "U", borad, r-1, c);
        }
        borad[r][c] = true;
    }
}
