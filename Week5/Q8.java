package Week5;


/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[]arg)
    {
    int i=1;
    int a=1;
    while(i!=0)
    {
        
            if(a%7==0 && a%9==0)
            {
                System.out.println(a);
                i=0;
            }
            a++;
        }
    }
    }
