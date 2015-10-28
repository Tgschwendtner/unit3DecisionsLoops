import java.util.Scanner;
public class MinMax
{
    public static double minMax()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println(" Enter a series of number or any character to stop. ");
        double largest = scan.nextDouble();
        double smallest = largest;
        
        while ( scan.hasNextDouble() )
        {
            double input = scan.nextDouble();
            if ( input > largest )
            {
                largest = input;
            }
            if ( input < smallest )
            {
                smallest = input;
            }
        }
        
        return largest;
        
    }
}
