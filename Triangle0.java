public class Triangle0 {
    public static void main(String[] args) {
        int n = 7;
        //int m = 5;
        for (int i=1;i<=n;i++) {
            //outer loop -> space print
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}