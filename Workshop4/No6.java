package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No6
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marked Price");
        float a=sc.nextFloat();
        System.out.println("Enter your category(A-D)");
        char b=sc.next().charAt(0);
        double c=0;
        if(b=='A')
        {
          c=a-(a*0.6);  
        }
        else if(b=='B')
        {
          c=a-(a*0.4);  
        }
        else if(b=='C')
        {
          c=a-(a*0.2);  
        }
        else if(b=='D')
        {
          c=a-(a*0.1);  
        }
        System.out.println("Your Selling price is "+c);
    }
}