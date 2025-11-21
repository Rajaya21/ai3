import java.util.Scanner;

/**
 * Write a description of class Varuable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Varuable
{
    public static void main(String[]arg)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter student's name");
       String name=sc.next();
       System.out.println("Enter student's age");
       int age=sc.nextInt();
       System.out.println("Enter student's GPA");
       float gpa=sc.nextFloat();
       System.out.println("Students name:"+name);
       System.out.println("Students age:"+age);
       System.out.println("GPA:"+gpa);
    }
}