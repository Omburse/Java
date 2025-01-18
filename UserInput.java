/*
Write a java program which asks the user to enter your name and gets then with Hello <|Name|> have a good day
text print
 */

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter your Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " Have A Good Day");
    }
}
