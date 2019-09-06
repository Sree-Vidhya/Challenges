package BlackJack;

import java.util.List;

public class GameApp
{
    public static void main(String[] args) {
        String playerReply;
        String dealerReply;
    Card newGameAppCard = new Card();
    Deck newGameAppDeck = new Deck();
    Play newGameAppPlay = new Play();
    Rules newGameAppRules = new Rules();
        System.out.println(newGameAppDeck.fiftyTwoCardDeck());

        System.out.println("Round One !");
        System.out.println();
        newGameAppPlay.shuffleCards();

        System.out.println("Player:");
        newGameAppPlay.addCardsToPlayerHand(newGameAppPlay.draw(2));

        int playerTotal = newGameAppPlay.getHandValuePlayer();
        List<String> displayhandPlayer = newGameAppPlay.displayHandPlayer();
        int aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);

        System.out.println("You are currently at " + aceValuePlayer);
        System.out.println("With the hand " + displayhandPlayer);
        System.out.println();
        System.out.println("Dealer:");
        newGameAppPlay.addCardsToDealerHand(newGameAppPlay.draw(2));

        int dealerTotal = newGameAppPlay.getHandValueDealer();
        List<String> displayhandDealer= newGameAppPlay.displayHandDealer();
        int aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);

        System.out.println("You are currently at " + aceValueDealer);
        System.out.println("With the hand " + displayhandDealer);
        System.out.println();

        playerReply = newGameAppRules.didPlayerWin(aceValuePlayer);
        dealerReply = newGameAppRules.didDealerWin(aceValueDealer);

        while(playerReply.equalsIgnoreCase("H"))
        {
            System.out.println("Next Round !");
            System.out.println();
            System.out.println("Player:");
            System.out.println();
            newGameAppPlay.addCardsToPlayerHand(newGameAppPlay.draw(1));

            playerTotal = newGameAppPlay.getHandValuePlayer();
            displayhandPlayer = newGameAppPlay.displayHandPlayer();
            aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);

            System.out.println("You are currently at " + aceValuePlayer);
            System.out.printf("with the hand: ");
            for (Card card : newGameAppPlay.playerHand) {
                System.out.printf("[%s, %s] ", card.Suit, card.Face);
            }
            System.out.println();
            playerReply = newGameAppRules.didPlayerWin(aceValuePlayer);
            dealerReply = newGameAppRules.didDealerWin(aceValueDealer);
        }
        while(dealerReply.equalsIgnoreCase("H"))
        {
            System.out.println("Dealer:");
            newGameAppPlay.addCardsToDealerHand(newGameAppPlay.draw(2));

             dealerTotal = newGameAppPlay.getHandValueDealer();
             displayhandDealer= newGameAppPlay.displayHandDealer();
             aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);

            System.out.println("You are currently at " + aceValueDealer);
            System.out.printf("with the hand: ");
            for (Card card : newGameAppPlay.dealerHand) {
                System.out.printf("[%s, %s] ", card.Suit, card.Face);
            }
            System.out.println();
            dealerReply =  newGameAppRules.didDealerWin(aceValueDealer);
        }
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
