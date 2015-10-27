import java.util.Scanner;
public class Maximum
{
    public static double maximun()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println(" Enter a series of number or any character to stop. ");
        double largest = scan.nextDouble();
        
        while ( scan.hasNextDouble() )
        {
            double input = scan.nextDouble();
            if ( input > largest )
            {
                largest = input;
            }
        }
        
        return largest;
    }
}
