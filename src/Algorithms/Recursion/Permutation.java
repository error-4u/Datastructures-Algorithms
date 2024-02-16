package Algorithms.Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        perm("", "abc");
        ArrayList<String> ans = permRet("", "abc");
        System.out.println(ans);
    }

    static void perm(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            perm(f + ch + s, up.substring(1));
        }
    }


    static ArrayList<String> permRet(String p, String up) {
        if (up.isEmpty()) {
           ArrayList<String> list = new ArrayList();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList();
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ArrayList<String> allpermutations = permRet(f + ch + s, up.substring(1));

            list.addAll(allpermutations);
        }
        return list;
    }
}