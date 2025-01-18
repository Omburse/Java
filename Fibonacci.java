/*
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

 */

public class Fibonacci{
static int fib(int n){
          if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
    else{
        return fib(n-1)+fib(n-2);
    }
}
public static void main(String[] args) {
    // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    int result = fib(7);
    System.out.println(result);
}
}