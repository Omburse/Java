/*
Write a java program to calculate Percentage of a given Student in CBSE Bord exam .
His marks from five Subject must be taken as input from the user
 */
import java.util.Scanner;
public class CalPer5sub {
    public static void main(String[] args) {
        float a , b , c ,d,e;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your DBMS Subject Marks is : " );
        a = sc.nextFloat();
        System.out.print("Enter your TOC Subject Marks is : " );
        b = sc.nextFloat();
        System.out.print("Enter your SPOS Subject Marks is : " );
        c = sc.nextFloat();
        System.out.print("Enter your CNS Subject Marks is : " );
        d = sc.nextFloat();
        System.out.print("Enter your IOT Subject Marks is : " );
        e = sc.nextFloat();

        float Per = (a+b+c+d+e/100)/5;
        System.out.print( "This CBSC Board Exam your Percentage is : " + Per);
    }
}
