import java.util.Scanner;

/*
Print x-y/2 take input from the user ?
 */
public class Associativity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value a is : ");
        int a = sc.nextInt();
        System.out.print("Enter the value b is : ");
        int b = sc.nextInt();

        int sum = (a-b)/2;
        System.out.println("The value of a and b are : " + sum);
    }
}
