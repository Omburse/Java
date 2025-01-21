/*
Write a function to print nth term of a Fibonacci Series using recursion
 */

public class FibSeries {
    static int fib(int n){
        if(n==0){
            return 1;
        } else if (n==1) {
            return 2;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        int om=fib(10);
        System.out.println(om);

    }
}
