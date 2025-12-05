package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No4
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a =sc.nextInt();
    if(a%3==0 && a%5==0)
    {
        System.out.println("The number is divisible by both 3 and 5");
    }
    else
    {
        System.out.println("The number is not divisible by both 3 and 5");
    }
    }
}