package Algorithms.Backtracking;

import java.util.ArrayList;

public class PrintingPath {
    public static void main(String[] args) {
        ArrayList<String> ans =  path("", 3,3);
        System.out.println(ans);

    }
    static ArrayList<String> path(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList <>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
            list.addAll(path(p +"D", r-1, c));
        }
        if(c>1){
            list.addAll(path(p +"R", r, c-1));
        }
        return list;
    }

}

