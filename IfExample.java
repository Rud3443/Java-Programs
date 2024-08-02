import java.util.Scanner;

class IfExample{
//entry point
   public static void main(String[] args){
//scanner object for user input
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter you know programming or not yes/no");
//store input in check variable
      String check = scan.next();
//condition
//equals - will not check case
      if (check.equals ("yes")){//true
         System.out.println("You know programming lang");
         }else{//false
            System.out.println("You don't know programming lang");
         }
   }
}	 