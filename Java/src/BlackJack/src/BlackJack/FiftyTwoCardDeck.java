package BlackJack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FiftyTwoCardDeck {
    List<Card> deck;
    //    public FiftyTwoCardDeck()
//    {
//        deck = new ArrayList<>();
//        for (int  i = 2; i< 10;i++) {
//            deck.add(new Card("HEART", i));
//            deck.add(new Card("SPADE",3));
//        }
//    }
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
    public void shuffleCards()
    {
        Collections.shuffle(deck);

    }
    public List<Card> draw(int numberOfCards)
    {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++)
        {
            cards.add(deck.get(0));
            deck.remove(0);
        }

        return cards;
    }
}
