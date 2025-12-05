package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No3
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    if(a>0)
    {
        System.out.println("Positive");
    }
    else if(a<0)
    {
        System.out.println("Negative");
    }
    else
    {
        System.out.println("Zero");
    }
    }
}