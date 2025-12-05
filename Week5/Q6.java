package Week5;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[]arg)
    {
        int a=0;
        int b=1;
        int c=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=8;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}