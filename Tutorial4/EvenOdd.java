package Tutorial4;
import java.util.Scanner;


/**
 * Write a description of class EvenOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOdd
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num1=sc.nextInt();
    if(num1%2==0)
    {
        System.out.println("Even");
    }
    else
    {
        System.out.println("Odd");
    }
    }
}