package BlackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame
{
    Deck newDeck = new Deck();
    List<Card> playerHand = new ArrayList<>();
    List<Card> dealerHand = new ArrayList<>();
    List<String> displayHandPlayer = new ArrayList<>();
    List<String> displayHandDealer = new ArrayList<>();
    public void shuffleCards()
    {
        Collections.shuffle(newDeck.fiftyTwoCardDeck());

    }
    public List<Card> draw(int numberOfCards)
    {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++)
        {
            cards.add(newDeck.deck.get(0));
            ((List<?>) newDeck.deck).remove(0);
        }

        return cards;
    }
    public List<Card> addCardsToPlayerHand(List<Card> cards)
    {
        playerHand.addAll(cards);
        return playerHand;
    }
    public List<Card> addCardsToDealerHand(List<Card> cards)
    {
        dealerHand.addAll(cards);
        return dealerHand;
    }
    public int getHandValuePlayer()
    {
        int total =0;
        for (Card card : playerHand)
        {

            total = total + Integer.parseInt(String.valueOf(card.Value));
        }
        return total;
    }
    public int getHandValueDealer()
    {
        int total =0;
        for (Card card : dealerHand)
        {

            total = total + Integer.parseInt(String.valueOf(card.Value));
        }
        return total;
    }
    public List<String>displayHandPlayer()
    {
        for(Card card: playerHand)
        {
            displayHandPlayer.add(card.Suit);
            displayHandPlayer.add(card.Face);
        }
        return displayHandPlayer;
    }
    public List<String>displayHandDealer()
    {
        for(Card card: dealerHand)
        {
            displayHandDealer.add(card.Suit);
            displayHandDealer.add(card.Face);
        }
        return displayHandDealer;
    }
}
