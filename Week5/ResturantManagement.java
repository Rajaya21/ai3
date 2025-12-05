package Week5;
import java.util.Scanner;


/**
 * Write a description of class ResturantManagement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResturantManagement
{
   public static void main(String[]arg)
   {
       Scanner sc=new Scanner(System.in);
       int c;
       int q;
       int t=0;
       do
       {
           System.out.println("MENU");
          System.out.println("1: Pizza Rs 500");
          System.out.println("2: MoMo Rs 300");
          System.out.println("0: Bill");
          System.out.println("Enter the choice");
          c=sc.nextInt();
          switch(c)
          {
              case 1:
                  System.out.println("You have ordered Pizza");
                  System.out.println("Enter the quantity");
                  q=sc.nextInt();
                  t=t+q*500;
                  break;
                  case 2:
                  System.out.println("You have ordered MoMo");
                  System.out.println("Enter the quantity");
                  q=sc.nextInt();
                  t=t+q*300;
                  break;
                  case 0:
                  System.out.println("Your total bill is: "+t);
                  break;
                  default:
                      System.out.println("Please Try Again");
                      break;
          }
       }while(c!=0);
   }
}