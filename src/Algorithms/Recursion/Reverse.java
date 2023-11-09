package Algorithms.Recursion;

public class Reverse {
    public static void main(String[] args) {
       rev(12345);

        System.out.println(sum);

    }

    // 1ST METHOD TO REVERSE
    static int sum = 0;
    static void rev(int n){

        int rem = n % 10;
        if(n == 0){
            return ;
        }
        sum = sum * 10 + rem;
         rev(n/10);

    }

}
