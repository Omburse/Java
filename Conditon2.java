/*
Write a java program to find out the day of week in given the numbers [1 for Monday , 2 for Thusday and so on ]
 */

import java.util.Scanner;

public class Conditon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        switch (a){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Satarday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
        }
    }
}
