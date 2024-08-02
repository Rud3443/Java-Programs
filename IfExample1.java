import java.util.Scanner;

class IfExample1{
//entry point
public static void main(String[] args){
//scanner object for user input
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter number 1");
      int num = scan.nextInt();
      System.out.println("Enter number 1");
      int num1= scan.nextInt();
      if (num==num1){
            System.out.println("Both number are equals");
      }
      else{
            System.out.println("Both number are not equals");
      }
}
}