package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No9
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter GPA");
        float a=sc.nextFloat();
        System.out.println("Enter attendance percentage in decimal");
        float b=sc.nextFloat();
        System.out.println("Enter attitude score(1-10)");
        int c=sc.nextInt();
        if(a>=3.2)
        {
            if(b>0.8)
            {
                if(c<5)
                {
                    System.out.println("Eligile");
                }
                else
                {
                    System.out.println("Not eligible");
                }
                System.out.println("Not eligible");
            }
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}