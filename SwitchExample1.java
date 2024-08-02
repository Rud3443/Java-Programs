import java.util.Scanner;

class SwitchExample1{
    //static method to display menu
    static void display(){

        System.out.println("1. Tea(Rs.20) ");
        System.out.println("2. Black Tea(Rs.15) ");
        System.out.println("3. Coffee(Rs.30) ");
        System.out.println("4. Choclate Cookie(Rs.25) ");
        System.out.println("5. Sandwich(Rs.50) ");
        System.out.println("6. Samosa(Rs.20) ");
        System.out.println("7. Generate bill & exit ");
    }
    public static void main(String[] args) {
        //scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to RMM Cafe ");

        int sum=0; // store total bill amount
        while(true){
            SwitchExample1.display(); //invoke static method
            System.out.println("Enter your choice: ");
            int n = sc.nextInt(); // enter choice as per display
            switch(n){
                case 1:
                System.out.println("Enter quantity");
                int a = sc.nextInt();
                sum = sum + 20 * a; // calculate total with price *quantity
                break;
                case 2:
                System.out.println("Enter quantity");
                int b = sc.nextInt();
                sum = sum + 15 * b;
                break;
                case 3:
                System.out.println("Enter quantity");
                int c = sc.nextInt();
                sum = sum + 30 * c;
                break;
                case 4:
                System.out.println("Enter quantity");
                int d = sc.nextInt();
                sum = sum + 25 * d;
                break;
                case 5:
                System.out.println("Enter quantity");
                int e = sc.nextInt();
                sum = sum + 50 * e;
                break;
                case 6:
                System.out.println("Enter quantity");
                int f = sc.nextInt();
                sum = sum + 20 * f;
                break;
                default:
                System.out.println("total bill "+ sum );
                System.out.println("Thank you for visiting RMM Cafe");
                break;
            }
        }
    }
}