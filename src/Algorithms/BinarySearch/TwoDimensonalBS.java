package Algorithms.BinarySearch;

import java.util.Arrays;

public class TwoDimensonalBS {
    public static void main(String[] args) {
        int matrix[][] = {
                {10,20,30,40},
                {15,25,35, 45},
                {28,29,37,49},
                {33,34,38,50}


        };
        int target = 50;
        System.out.println(Arrays.toString(search(matrix, target)));
        
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int r = 0;
        int c = cols-1;

        while(r < rows && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else {
                c--;
            }
        }
        return new int[]{ -1, -1};
    }
}

