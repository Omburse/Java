/*
Statement--> Create an array of 5 float and calculate theri Sum .?
 */

public class Array2d {
    public static void main(String args[]){
        float sum=0;
        float [] Arr={27.0f,33.89f,69.89f,76.77f,76.99f};
        for(float element :Arr){
            sum= element + sum;
        }
        System.out.println("Tha Sum of 5 value is : " + sum);
    }
}
