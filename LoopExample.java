import java.util.Scanner ;

class LoopExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        int num = sc.nextInt();
        //for(initialize;condition;inc/dec)
        for(int i=0;i<=10;i++){
            System.out.println("Value is : " + (num*i));
        }
        System.out.println("Enter number for table");
        int num1 = sc.nextInt();
        int i=1;
        while(i<=11){
            System.out.println("Value is : " + (num1*i));
            i=i+2;
        }
    }
}
