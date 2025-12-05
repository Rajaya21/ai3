package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No7
{
     public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marked Price");
        float a=sc.nextFloat();
        System.out.println("Enter your category(A-D)");
        char b=sc.next().charAt(0);
        double c=0;
        switch(b)
        {
            case 'A':
                c=a-(a*0.6);
                break;
                case 'B':
                c=a-(a*0.4);
                break;
                case 'C':
                c=a-(a*0.2);
                break;
                case 'D':
                c=a-(a*0.2);
                break;
                default:
                    System.out.println("Invalid");
        }
        System.out.println("The Selling price is "+c);
    }
}