/*
Write a program to print multiplication table of 10 in revers order .
 */
public class PracticeSet4 {
    public static void main(String[] args) {
        int n=10;
        for(int i=n;i>=1;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
