package Week5;


/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[]arg)
    {
    for(int i=1;i<=100;i++)
    {
        if(i%2==0)
        {
          continue;  
        }
        else if(i%13==0)
        {
            break;
        }
        System.out.println(i);
    }
}
}