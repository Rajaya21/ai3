package workshop3;
import java.util.Scanner;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        {
        System.out.println("Enter your grade");
        int a=sc.nextInt();
        String b=(a>=40)?"Pass":"Fail";
        System.out.println(b);
        
        }
    }
}