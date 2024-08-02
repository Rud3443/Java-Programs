import java.util.Scanner ;

class DoWhileExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        int num = sc.nextInt();
        //for(initialize;condition;inc/dec)
        for(int i=0;i<=10;i++){
            System.out.println("Value is : " + (num*i));
        }
        System.out.println("Enter number for  while table");
        int num1 = sc.nextInt();
        int i=1; //intialize
        while(i<=11){ //condition
            System.out.println("Value is : " + (num1*i));
            i=i+2; //inc/dec
        }
        //atleast execute, if condition is wrong
        System.out.println("Enter number for do while table");
        int num2 = sc.nextInt();
        int j=1; //initialize
        do { 
            System.out.println("Value is : " + (num2*j));
            j++; // inc/dec
        } while(j<=5); //condition
           
    }
}

