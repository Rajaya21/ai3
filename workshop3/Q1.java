package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    {
    System.out.println("Enter first number");
    float a= sc.nextFloat();
    System.out.println("Enter second number");
    float b=sc.nextFloat();
    float sum=a+b;
        float diff=(a>b)?a-b:b-a;
        float pro=a*b;
        float quo=(a>b)?a/b:b/a;
        float mod=(a>b)?a%b:b%a;
        float bigger=(a>b)?a:b;
    System.out.println("The sum is "+sum+"\n The difference is "+diff+"\n The product is "+pro+" \n The modulos is "+mod+"\n The bigger number is "+bigger);

    }
    }
    
}