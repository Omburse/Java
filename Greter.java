/*
Statement --> Write a function which taken in two number and return The greter of those Two
 */
import java.util.Scanner;

public class Greter {
    public static int FindGre(int a,int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First No : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second No : ");
        int b = sc.nextInt();

        int Gre = FindGre(a,b);
        System.out.println("The Greater value is : " + Gre);

    }
}
