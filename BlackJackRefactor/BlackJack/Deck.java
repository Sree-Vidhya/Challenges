package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> deck;
    public List<Card> fiftyTwoCardDeck()
    {
        deck = new ArrayList<>();
        String[] suitsArr = {"'HEART '", "'SPADE '", "'CLUB '", "'DIAMOND '"};
        String[] faceArr = {"'KING '", "'QUEEN '", "'JACK '"};
        for (int j = 0; j < suitsArr.length; j++)
        {
            for (int i = 2; i < 11; i++)
            {
                deck.add(new Card(suitsArr[j], i, Integer.toString(i)));
            }
        }
        for (int j = 0; j < suitsArr.length; j++)
        {
            for (int i = 0; i < faceArr.length; i++)
            {
                deck.add(new Card(suitsArr[j], 10, faceArr[i]));
            }
        }
        for (int j = 0; j < suitsArr.length; j++)
        {
            deck.add(new Card(suitsArr[j],1,"'ACE '"));
        }
        return deck;
    }
}
