package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No8
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your GPA");
    float a=sc.nextFloat();
    if(a==4.00)
    {
        System.out.println("A+");
    }
    else if(a>=3.6 && a<4.00)
    {
        System.out.println("A");
    }
    else if(a>=3.2 && a<3.9)
    {
        System.out.println("B+");
    }
    else if(a>=2.8 && a<3.2)
    {
        System.out.println("B");
    }
    else if(a>=2.2 && a<2.8)
    {
        System.out.println("C+");
    }
    else if(a<2.2)
    {
        System.out.println("Fail");
    }
    else
    {
        System.out.println("Invalid GPA");
    }
}
}