package workshop3;
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
        System.out.println("Enter number of days");
        int a= sc.nextInt();
        int year=a/365;
        int c=a%365;
        int month=c/30;
        int d=c%30;
        System.out.println("Year: "+year);
        System.out.println("Month: "+month);
        System.out.println("Days:"+d);
    }
    }
}