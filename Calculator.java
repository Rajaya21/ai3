import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    {
    System.out.println("FIRST NUMBER:");
    float f=sc.nextFloat();
    System.out.println("SECOND NUMBER");
    float s=sc.nextFloat();
    System.out.println("First number is:"+f);
    System.out.println("Second number is:"+s);
    float a= f+s;
    float b= f-s;
    float c= f/s;
    float d= f%s;
    float e = f*s;
    float g=(f>s)?f:s;
    System.out.println(g+"is bigger");
    System.out.println("The sum is"+a);
    System.out.println("The difference is"+b);
    System.out.println("First number by second number is"+c);
    System.out.println("The modulos is"+d);
    System.out.println("The sum is"+e);
    
}
}
}