import java.util.Scanner ;

class ForloopExample{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        int num = sc.nextInt();
        //for(initialize;condition;inc/dec)
        for(int i=0;i<=10;i++){
            System.out.println("Value is : " + (num*i));
        }
    }
}