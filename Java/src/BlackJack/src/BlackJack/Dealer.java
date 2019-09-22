package BlackJack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {
    List<Card> hand = new ArrayList<>();
    List<String> displayHandDealer = new ArrayList<String>();

    public List<Card> player(FiftyTwoCardDeck deck) {
        hand.addAll(deck.draw(2));
        return hand;
    }

    public List<Card> addCardsToHand(List<Card> cards)
    {
        hand.addAll(cards);
        return hand;
    }

    public int getHandValueDealer()
    {
        int total =0;
        for (Card card : hand) {

            total = total + card.Value;
        }
        return total;
    }

    public List<String> displayHandDealer()
    {
        for(Card card: hand){
            displayHandDealer.add(card.Suit);
            displayHandDealer.add(card.Face);
        }
        return displayHandDealer;
    }
    public void didDealerWin()
    {
        if(getHandValueDealer() == 21)
        {
            System.out.println("Dealer Wins!!!..");
            System.exit(0);
        }
    }
    public void didDealerBust()
    {
        if(getHandValueDealer() > 21)
        {
            System.out.println("BUSTED!! and the player wins");
            System.exit(0);
        }
    }
    public String shouldDealerContinue (Dealer roundOoneDealer)
    {
        Scanner input = new Scanner(System.in);
        String dealerReply;
        if(roundOoneDealer.getHandValueDealer() < 17)
        {
            dealerReply = "H";
        }
        else
        {
            System.out.println("Dealer Round");
            System.out.println("Do you want to hit or stay: \nH for hit \nS for stay");
            dealerReply = input.nextLine();
        }
        return dealerReply;
    }

}
