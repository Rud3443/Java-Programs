import java.util.Scanner;
class NestedIfElse1{
public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Present/Absent");
    String status=scan.next();
    if(status.equalsIgnoreCase("Present")){
        System.out.println("Enter Marks");
        int score=scan.nextInt();
        if(score<99 && score>=80){
            System.out.println("Pass- O+");
        }
        else if(score<80 && score>=70){
            System.out.println("Pass- A+");
        }
        else if(score<70 && score>=60){
            System.out.println("Pass- A");
        }
        else if(score<60 && score>=50){
            System.out.println("Pass- B");
        }
        else if(score<50 && score>=40){
            System.out.println("Pass- C");
        }
        else if(score<40 && score>=30){
            System.out.println("Pass- D");
        }
        else if(score<30 && score>=1){
            System.out.println("Pass- Fail");
        }
        else{
            System.out.println("Invalid Marks");
        }

    }else{
        System.out.println("FAIL - You are Absent, Attempt KT Exam");
    }
}
}
