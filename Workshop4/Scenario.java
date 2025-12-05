package Workshop4;
import java.util.Scanner;


/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age group (child / adult / senior): ");
        String ageGroup = sc.nextLine();

        System.out.println("Enter movie language (nepali / hindi / english): ");
        String language = sc.nextLine();

        System.out.print("Are you a student? (yes/no): ");
        String student = sc.next();

        System.out.print("Is it a festival day? (yes/no): ");
        String festival = sc.next();

        double price = 0;

        if (ageGroup.equals("child")) {
            price = 150;
        } 
        else if (ageGroup.equals("adult")) {
            price = 250;
        } 
        else if (ageGroup.equals("senior")) {
            price = 200;
        } 
        else {
            System.out.println("Invalid age group!");
            return;
        }

        if (language.equals("hindi")) {
            price += 50;
        } 
        else if (language.equals("english")) {
            price += 100;
        } 
        else if(language.equals("nepali")) {
            price = price;
        }
        else {
            System.out.println("Invalid language!");
            return;
        }

        if (student.equals("yes")) {
            price = price - (price * 0.20);
        }

        if (festival.equals("yes")) {
            price = price - (price * 0.15);
        }


        System.out.println("Final Ticket Price: Rs. " + price);
    }
}