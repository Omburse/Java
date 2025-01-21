/*
Statement--> Write a java program to find out the given float value are present in an arrya list or not

 */

public class Array2D2 {
    public static void main(String[] args) {
        float number [] = {44.55f,66.77f,98.80f};
        float num=45.55f;
        boolean isInArray = false;
        for(float element : number){
            if(num==element){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value are present in array list ");
        }
        else{
            System.out.println("The value of element are not present");
        }
    }

}
