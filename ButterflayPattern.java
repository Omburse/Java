public class ButterflayPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            //Star Print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //Star Print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Space
            int space=2*(n-i);
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }

            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
