/**A year with 366 days is called a leap year. Leap years are necessary to keep the calendar
synchronized with the sun because the earth revolves around the sun once
every 365.25 days. Actually, that figure is not entirely precise, and for all dates after
1582 the Gregorian correction applies. Usually years that are divisible by 4 are leap
years, for example 1996. However, years that are divisible by 100 (for example, 1900)
are not leap years, but years that are divisible by 400 are leap years (for example,
2000). Write a program that asks the user for a year and computes whether that year
is a leap year. Provide a class Year with a method isLeapYear. Use a single if statement
and Boolean operators.**/
import java.util.Scanner;
public class Leap_Year
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       
       System.out.print("What year would you like to compute? ");
       int year = in.next();
       
    }
    
}