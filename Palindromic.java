public class Palindromic {
    public static void main(String[] args) {
        int n=5;
        //Outer Loop
        for(int i=1;i<=n;i++){
            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //First Haif loop
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Second Haif loop
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Revers all Process
        for(int i=n;i>=1;i--){
            //Space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //First Haif loop
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //Second Haif loop
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
