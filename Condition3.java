/*
Write a program to find out the type of website from the url
.Com --> Commerical .com
.Org --> Organigation .org
.in --> Indian.in


 */
import java.util.Scanner;
public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website=sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println("Organigation Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Invalid website");
        }
    }
}
