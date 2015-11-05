import java.util.Scanner;
public class P6_2 
{
    public static double P6_2()
    {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int integer = inputs.nextInt();
        int fold1 = 1;
        int fold2 = 1;
        for( int i = 0;
                i < integer - 2;
                i++)
        {
            int fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }
        return fold1;
    }
}
    