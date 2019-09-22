package BlackJack;

import java.util.List;

public class GameApp
{
    public static void main(String[] args) {
        String playerReply;
        String dealerReply;
        int playerTotal;
        int dealerTotal;
        List<String> displayhandPlayer;
        List<String> displayhandDealer;
        int aceValuePlayer;
        int aceValueDealer;
        CardGame newGameAppCardGame = new CardGame();
        Rules newGameAppRules = new Rules();
        newGameAppCardGame.shuffleCards();
        newGameAppCardGame.addCardsToPlayerHand(newGameAppCardGame.draw(2));
        playerTotal = newGameAppCardGame.getHandValuePlayer();
        displayhandPlayer = newGameAppCardGame.displayHandPlayer();
        aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);
        System.out.println("Round One !");
        System.out.println();
        System.out.println("Player:");
        System.out.println("You are currently at " + aceValuePlayer);
        System.out.println("With the hand " + displayhandPlayer);
        System.out.println();

        newGameAppCardGame.addCardsToDealerHand(newGameAppCardGame.draw(2));
        dealerTotal = newGameAppCardGame.getHandValueDealer();
        displayhandDealer= newGameAppCardGame.displayHandDealer();
        aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);

        System.out.println("Dealer:");
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
            newGameAppCardGame.addCardsToPlayerHand(newGameAppCardGame.draw(1));

            playerTotal = newGameAppCardGame.getHandValuePlayer();
            aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);

            System.out.println("You are currently at " + aceValuePlayer);
            System.out.printf("with the hand: ");
            for (Card card : newGameAppCardGame.playerHand)
            {
                System.out.printf("[%s, %s] ", card.Suit, card.Face);
            }
            System.out.println();
            playerReply = newGameAppRules.didPlayerWin(aceValuePlayer);
            dealerReply = newGameAppRules.didDealerWin(aceValueDealer);
        }
        while(dealerReply.equalsIgnoreCase("H"))
        {
            System.out.println("Dealer:");
            newGameAppCardGame.addCardsToDealerHand(newGameAppCardGame.draw(1));

             dealerTotal = newGameAppCardGame.getHandValueDealer();
             aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);


            dealerReply =  newGameAppRules.didDealerWin(aceValueDealer);
        }
        newGameAppRules.ifBothStayed(dealerReply,playerReply,aceValuePlayer,aceValueDealer);
    }
}
