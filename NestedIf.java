import java.util.Scanner;

class NestedIf{
//entry point
   public static void main(String[] args){
//scanner object for user input
      Scanner scan = new Scanner (System.in);
      System.out.println("Enter you know programming or not yes/no");
//store input in check variable
      String check = scan.next();
//condition
//equals - will not check case
      if (check.equalsIgnoreCase ("yes")){//true-outer if
         System.out.println("Enter you know development lang or not yes/no");
         //store input in check variable
         String lang=scan.next();
         if(lang.equalsIgnoreCase("yes")){ //true-inner if
            System.out.println(" you know programming & development lang");
        }
        else{//false-inner if
            System.out.println(" you don't know programming but don't development lang");
        }

         }else{//false-outer if
            System.out.println("You don't know programming lang");
         }
   }
}	 