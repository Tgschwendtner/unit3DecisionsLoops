//R6.16.
import java.util.Scanner;
public class R6_16Test
{
    public static double R6_16Test()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println( "Enter number: ");
        int n = scan.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
        return n;
    }
}