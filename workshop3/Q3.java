package workshop3;
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
        System.out.println("Enter time in seconds");
        int a= sc.nextInt();
        int hour=a/3600;
        int c=a%3600;
        int minute=c/60;
        int d=c%60;
        System.out.println(hour+"Hours");
        System.out.println(minute+"minutes");
        System.out.println(d+"second");
    }
    }
}