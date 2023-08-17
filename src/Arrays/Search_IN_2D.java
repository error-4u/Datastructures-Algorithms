
//https://leetcode.com/problems/search-a-2d-matrix/

package Arrays;

import java.util.Arrays;

public class Search_IN_2D {
    public static void main(String[] args) {
     int arr[][] = {
             {1,3,5,7},
             {10,11,16,20},
             {23,30,34,60}
     };
       int target = 98;
       boolean ans = search(arr,target);

        System.out.println(ans);

    }

    static boolean search(int[][] arr,int target){

        for (int rows = 0; rows < arr.length-1; rows++) {
            for (int cols= 0; cols < arr.length-1; cols++) {
                if(arr[rows][cols] == target ){
                    return true;


                }
            }
        }

         return false;

    }


}

