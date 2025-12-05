package Week5;
import java.util.Scanner;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    {
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                b++;
            }
        }
        if(b==2)
        {
            System.out.println("The number is prime");
        }
        else
        {
            System.out.println("The number is composite");
        }
    }
    }
}