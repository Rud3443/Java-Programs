import java.util.Scanner;

class SwitchExample{

    public static void main(String[] args) {
        char operator;
        double num1, num2, res;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        num1 = sc.nextDouble();
        System.out.println("Enter number2");
        num2 = sc.nextDouble();
        System.out.println("Enter operator +,-,*,/ ");
        operator = sc.next().charAt(0);
       
        switch(operator){
            case '+':
            res = num1 + num2;
            System.out.println("Addition is : "+ res);
            break;
            case '-':
            res = num1 - num2;
            System.out.println("Subtraction is : "+ res);
            break;
            case '*':
            res = num1 * num2;
            System.out.println("Multiplication is : "+ res);
            break;
            case '/':   
            res = num1 / num2;
            System.out.println("Division is : "+ res);
            break;
            default:
            System.out.println("Invalid operator entered");

        }

    }
}