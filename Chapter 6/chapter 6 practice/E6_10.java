import java.util.Scanner;
public class E6_10
{
    public static void E6_10()
    {
        Scanner scan = new Scanner( System.in );
        System.out.println("Type a word: ");
        String word;
        word = scan.next();
        int length = word.length();
        System.out.println(length);
        int i = 0;
        while(i != length)
        {
            String sub = word.substring(i , i+1);
            System.out.println(sub);
            i += 1;
            for(i = length; i == length; i++)
            {
                System.out.println(word);
            }
        }

    }
}