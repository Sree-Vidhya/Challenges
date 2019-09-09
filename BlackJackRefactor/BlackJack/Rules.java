package BlackJack;


import java.util.List;
import java.util.Scanner;

public class Rules
{
    public int valueOfAce(int total, List<String>displayHandPlayer)
    {
        if(total < 11)
        {
            if((displayHandPlayer.contains("'ACE '")))
            {
                total = total +10;
                return total;
            }
        }
        return total;
    }
    public String didPlayerWin(int total)
    {
        String reply = "H";
        Scanner input = new Scanner(System.in);
        if(total == 21)
        {
            System.out.println("You beat the dealer!! Congrats!..");
            System.exit(0);
        }
        else if(total > 21)
        {
            System.out.println("BUSTED!! and the dealer Wins");
            System.exit(0);
        }
        else
        {
            System.out.println();
            System.out.println("Do you want to hit or Stay? \nH for hit\nS for stay");
             reply =  input.nextLine();
            System.out.println();
        }
        return reply;
    }
    public String didDealerWin(int total)
    {
        String reply = "H";
        Scanner input = new Scanner(System.in);
        if(total == 21)
        {
            System.out.println("Dealer Win!! Better Luck Next time");
            System.exit(0);
        }
        else if(total > 21)
        {
            System.out.println("BUSTED!! and the Player Wins");
            System.exit(0);
        }
        else if(total < 17)
        {
            reply = "H";
        }
        else if((total > 17) && (total < 21))
        {
            reply = "S";
        }
        return reply;
    }
    public void ifBothStayed(String dealerReply, String playerReply, int aceValuePlayer, int aceValueDealer)
    {

        if(dealerReply.equalsIgnoreCase("s")&&(playerReply.equalsIgnoreCase("s")))
        {
            if(aceValuePlayer > aceValueDealer)
            {
                System.out.println("You beat the dealer!! Congrats!..");
                System.exit(0);
            }
            else if (aceValuePlayer < aceValueDealer)
            {
                System.out.println("Dealer Win!! Better Luck Next time");
                System.exit(0);
            }
        }
    }
}
