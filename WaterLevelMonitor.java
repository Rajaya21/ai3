import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[]arg)
    {
    System.out.println("The water level is 950L");
    int level=950;
    String a=(level>=1000)?"Warning! the level exceeds 1000l":"Normal";
    System.out.println(a);

    
    }
}