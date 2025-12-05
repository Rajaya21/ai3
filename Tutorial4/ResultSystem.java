package Tutorial4;
import java.util.Scanner;


/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
   public static void main(String[]arg)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int p=sc.nextInt();
    if(p<=100 && p>=90)
    {
        System.out.println("Distinction");
    }
    else if(p>=70 && p<90)
    {
        System.out.println("First Division");
    }
    else if(p>=50 && p<70)
    {
        System.out.println("Second Division");
    }
    else if(p>=35 && p<50)
    {
        System.out.println("Third Division");
    }
    else if(p<35)
    {
        System.out.println("Fail");
    }
    else
    {
        System.out.println("Invalid number");
    }
    }
}