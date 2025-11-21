package workshop3;
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
    System.out.println("Enter distance in km");
    float a=sc.nextFloat();
    System.out.println("Enter time in minutes");
    int b=sc.nextInt();
    System.out.println("Are you travelling during the night?");
    String c=sc.next();
     System.out.println("Are you a local");
    String d=sc.next();
    float rate=a*6;
    float rate1=b*2.5f;
    float price=rate+rate1;
    
    
    }
    }
}