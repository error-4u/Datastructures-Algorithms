package Algorithms.Recursion;

public class print_1toN {
    public static void main(String[] args) {
     printN(5);
    }
    static void printN(int n) {
        if(n==0){
            return;
        }
        printN(n-1);
        System.out.println(n);

//        THIS WILL RETURN IN THE REVERSE ORDER
//        System.out.println(n);
//        printN(n-1);

    }
}
