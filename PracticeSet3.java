/*
Write a program to print a sum of a n numbers.
 */

public class PracticeSet3 {
    public static void main(String[] args) {
        int sum=0;
        int n=5;
        for(int i=0;i<n;i++){
            sum=sum+(2*i);
            System.out.println(sum);
        }
    }
}
