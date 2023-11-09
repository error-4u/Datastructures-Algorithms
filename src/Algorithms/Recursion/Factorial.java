package Algorithms.Recursion;

public class Factorial {
    public static void main(String[] args) {

        int ans = fact(5);
        System.out.println(ans);
    }



    static int fact(int n) {
        if(n == 0){
            return n;










            
        }

        return n * fact(n-1);
    }
}