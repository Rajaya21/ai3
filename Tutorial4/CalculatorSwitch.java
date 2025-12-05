package Tutorial4;
import java.util.Scanner;


/**
 * Write a description of class CalculatorSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorSwitch
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int n=sc.nextInt();
        System.out.println("Enter the second number");
        int n1=sc.nextInt();
        System.out.println("Enter the operator as + - * / %");
        char o=sc.next().charAt(0);
        switch(o)
        {
            case '+':
                System.out.println("Addition is "+(n+n1));
                break;
            case '-':
                System.out.println("Substraction is "+(n-n1));
                break;
                case '*':
                System.out.println("Multiplication is "+(n*n1));
                break;
                case '/':
                System.out.println("Division is "+(n/n1));
                break;
                case '%':
                System.out.println("Remainder is "+(n%n1));
                break;
                default:
                    System.out.println("Invalid");
        }
    }
}