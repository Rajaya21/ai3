package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class No11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class No11
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Annual income");
    long a=sc.nextLong();
    double b=0;
    if(a<=500000)
    {
        b=(0.01*a);
    }
    else if(a<=700000 && a>500000)
    {
        b=5000+(a-500000)*0.1;
    }
    else if(a<=1000000 && a>700000)
    {
        b=15000+(a-700000)*0.2;
    }
    else if(a>1000000 && a>=2000000)
    {
        b=35000+(a-1000000)*0.3;
    }
    else if(a>2000000 && a>=5000000)
    {
        b=335000+(a-2000000)*0.36;
    }
    else if(a>5000000)
    {
        b=1135000+(a-5000000)*0.39;
    }
    System.out.println("Your TAX is "+b);
}
}