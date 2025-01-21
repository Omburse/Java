/*
Statement--> Write a java program to find the maximum element in an array
 */

public class Array2D5 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 10};
        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The max value are present in a given element is : " + array);
    }
}
