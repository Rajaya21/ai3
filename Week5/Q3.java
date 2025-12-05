package Week5;
import java.util.Scanner;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    {
        System.out.println("Enter an integer");
        int a=sc.nextInt();
        int b=0;
        int c;
        int d=0;
        b=a;
        while(a!=0)
        {
          c=a%10;
          d=d*10+c;
          a=a/10;
        }
        System.out.println("The reversed integer is:"+d);
        if(b==d)
        {
            System.out.println("The integer is Palindrome");
        }
        else
        {
            System.out.println("The integer is not Palindrome");
        }
    }
    }
}