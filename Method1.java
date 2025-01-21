/*
Statement--> Write a java Method to print Multiplication table of a no n.
 */

public class Method1 {
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n", n ,i,n*i);
        }
    }
    public static void main(String[] args) {
        mul(13);
    }
}
