/*
Write a java program to find out whether a student is pass or fail . if it requres total 40%
and at least 33 % in each subject to pass . Assume 3 subject and take a marks as an input from the user
 */

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        float a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Physics marks : ");
        a = sc.nextFloat();
        System.out.print("Enter your Maths marks : ");
        b = sc.nextFloat();
        System.out.print("Enter your Chemistry marks : ");
        c = sc.nextFloat();

        float avg = (a+b+c)/3f;

        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.print("Cong you are Pass");
        }
        else {
            System.out.println("Sorry you are fail , plz try again ");
        }
    }
}
