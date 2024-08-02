//half pyramid-star
import java.util.Scanner;
class Pattern4{
    static void printNumber(int n){
        int i,j;
        //outer loop to handle upper part
        for (i=1;i<=n;i++){
            //inner loop to handle spaces
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to handle stars
            for (j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer loop to handle lower part
        for (i=n-1;i>=1;i--){
            //inner loop to handle spaces
            for (j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop to handle stars
            for(j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        Pattern4.printNumber(n);
    }
}
