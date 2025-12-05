package Week5;
import java.util.Scanner;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("Enter a number");
            int a=sc.nextInt();
            int b=0;
            int c=0;
            int d=0;
            while(a!=0)
            {
                b=a%10;
                a=a/10;
                if(b%2==0)
                {
                    c++;
                }
                else
                {
                    d++;
                }
            }
            System.out.println("Even digit:"+c);
            System.out.println("Odd digit:"+d);
        }
    }
}