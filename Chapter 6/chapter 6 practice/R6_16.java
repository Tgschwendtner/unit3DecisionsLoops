//R6.15 and R6.16.
import java.util.Scanner;
public class R6_16 
{
    public static double R6_16()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter number: ");
        int n = scan.nextInt();
        double x = 0;
        double s = 1.0/ (1 + n * n);
        while (s > 0.01)
        {
            s = 1.0/ (1 + n * n);
            n++;
            x = x + s;
        }
        return n;
    }
}