import java.util.Scanner;
public class P6_4
{
    public static void P6_4()
    {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int integer = inputs.nextInt();
        for(    int i = 2;
                i <= integer;
                i++)
        {
            //a number is aprime number if it is not divisible by any number except 1 and itself.
            if (integer/i != 0)
            {
                System.out.println(i);
            }
        }
    }
}