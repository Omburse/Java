import java.util.Scanner;

public class FunctionSum {
    public static int SumNoOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += 1;
            }

        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n no : ");
        int n = sc.nextInt();

        int sum=SumNoOdd(n);
        System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sum);

    }
}
