package Algorithms.Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
    static int fibo(int n){

        if(n < 2){
            return -1;
        }
        return fibo(n-2) + fibo(n-1);
    }
}
