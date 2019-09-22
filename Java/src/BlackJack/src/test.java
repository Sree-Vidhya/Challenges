//import BlackJack.Card;
//
//import java.util.ArrayList;
//import java.util.concurrent.ThreadLocalRandom;
//
//public class test {
//
//
//}
//package BlackJack;
//
//        import java.util.ArrayList;
//        import java.util.concurrent.ThreadLocalRandom;
//
//public class FiftyTwoCardDeck {
//    ArrayList<Card> card;
//    int cardMinLimit = 2;
//    int cardMaxLimit = 14;
//    int suitMinLimit = 1;
//    int suitMaxLimit = 4;
//    int cardValue;
//    int suitsValue;
//
//    int cardValueGenerator()
//    {
//        cardValue = ThreadLocalRandom.current().nextInt(cardMinLimit, cardMaxLimit + 1);
//        return cardValue;
//    }
//    int suitValueGenerator()
//    {
//        suitsValue = ThreadLocalRandom.current().nextInt(suitMinLimit, suitMaxLimit + 1);
//        return suitsValue;
//    }
//    public ArrayList<Card> draw(){
//        if (card.contains(cardValue))
//        {
//            cardValueGenerator();
//        }
//        else
//        {
//            card.add(new Card(cardValue, suitsValue));
//        }
//        return card;
//    }
//
//
////    public Card draw()
////    {
////        Card card =  deck.get();
//////        deck.remove(0);
////        return card;
////    }
//
//
//}
