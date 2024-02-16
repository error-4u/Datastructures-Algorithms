package Algorithms.Recursion.google;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
   diceCombination("", 5);
        ArrayList<String> ans = diceCombinationRet("", 5);
        System.out.println(ans);
    }
    static void diceCombination(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= target ; i++) {
            diceCombination(p + i, target-i);
        }
    }
    static ArrayList<String> diceCombinationRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            list.addAll(diceCombinationRet(p + i, target - i));
        }
        return list;
    }
}
