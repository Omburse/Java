/*
Statement-->Calculate the avg marks from an array cotaning marks of are student in physics using for each loop
 */

public class Array2D3 {
    public static void main(String[] args) {
        float [] number = {27.88f,55.66f,68.86f,};
        float sum=0;
        for(float element:number){
            sum=sum+element;
        }
        System.out.println("The avg marks is : "+  sum /number.length);
    }
}
