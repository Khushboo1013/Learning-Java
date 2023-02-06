import java.util.*;
public class Day5_n_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter a operator :");
        char op=sc.next().charAt(0);
        switch (op) {
            case '%':
            System.out.print("Reminder" +(num1%num2));
                break;
            case '*':
            System.out.print("Multiplication" +(num1*num2));
                break;
            case '+':
            System.out.print("Addition" +(num1+num2));
                break;
            case '-':
            System.out.print("Subtraction" +(num1-num2));
                break;
            case '/':
            System.out.print("Division" +(num1/num2));
                break;
            default:
            System.out.print("Not given");
                break;
        }

    }
}
