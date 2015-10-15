import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        //(your code goes here…)
        int result = player1.compareTo(player2);
        if (result == 0)
        {
            System.out.println("Tie");
        }
        if (result < 0)
        {
            System.out.println("Player1 Wins");
        }
        if (result > 0)
        {
            System.out.println("Player2 Wins");
        }
    }
}