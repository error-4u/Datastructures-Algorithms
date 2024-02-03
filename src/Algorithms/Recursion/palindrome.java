package Algorithms.Recursion;

public class palindrome {
    public static void main(String[] args) {
        palin(9802302);
    }
    static void palin(int n){
        int rem = n % 10;
        int count = 0;
        if(rem==0){
            count ++ ;
        }
        n = n / 10;
        System.out.println(count);
    }
}
