package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> hand = new ArrayList<>();
    int n;
    List<String> displayHandPlayer = new ArrayList<String>();


    public List<Card> player(FiftyTwoCardDeck deck) {
        hand.add((Card) deck.draw(n));
        return hand;
    }

    public List<Card> addCardsToHand(List<Card> cards)
    {
        hand.addAll(cards);
        return hand;
    }

    public int getHandValuePlayer()
    {
        int total =0;
        for (Card card : hand) {

             total = total + Integer.parseInt(String.valueOf(card.Value));
        }
        return total;
    }

    public List<String>displayHandPlayer()
    {
        for(Card card: hand){
            displayHandPlayer.add(card.Suit);
            displayHandPlayer.add(card.Face);
        }
        return displayHandPlayer;
    }
    public void didPlayerWin()
    {
        if(getHandValuePlayer() == 21)
        {
            System.out.println("You beat the dealer!! Congrats!..");
            System.exit(0);
        }
    }
    public void didPlayerBust()
    {
        if(getHandValuePlayer() > 21)
        {
            System.out.println("BUSTED!! and the dealer Wins");
            System.exit(0);
        }
    }

}
