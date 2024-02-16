package Algorithms.Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
       subseq("", "abcd");
        ArrayList<String> ans  = subseqReturnarraylist("", "abc");

        System.out.println(ans);
        subseqAsci("", "abc");
    }

    static void subseq(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p, up.substring(1) );
        subseq(p+ ch, up.substring(1) );
    }
    static ArrayList<String> subseqReturnarraylist(String p, String up ){
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()){
          list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =  subseqReturnarraylist(p, up.substring(1));
        ArrayList<String> right =  subseqReturnarraylist(p+ch, up.substring(1));
        left.addAll(right);
        return left;
    }

    static void subseqAsci(String p, String up){
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAsci(p, up.substring(1) );
        subseqAsci(p+ ch, up.substring(1) );
        subseqAsci(p + (ch+0), up.substring(1));
    }


}
