package Week5;


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
        int a=0;
        int b=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                a=a+i;
            }
            else
            {
                b=b+i;
            }
        }
        System.out.println("The sum of even numbers is "+a);
        System.out.println("The sum of odd numbers is "+b);
    }
}