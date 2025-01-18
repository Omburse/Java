/*
Statement --> Write a function that takes in the radius as input and returns the circumference of a circle.
 */

import java.util.Scanner;

public class Circumf {
    public static double Radius(double radius){
        return 2*3.142*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Circle is : ");
        double radius = sc.nextDouble();

        int Circumfernc = (int) Radius(radius);
        System.out.println("The Circumfernc of circle is : " +  Circumfernc);

    }
}
