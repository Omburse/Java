/*
Statement-->Write a function that takes in age as input and returns if that person is eligible to vote or not. .
            A person of age > 18 is eligible to vote

 */

import java.util.Scanner;

public class EligibleToVote {
    public static boolean Eligible(int age){
        return age>18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(Eligible(age)){
            System.out.print("You are Eligible for vote ");
        }
        else {
            System.out.println("You are not Eligible for vote ");
        }

    }
}
