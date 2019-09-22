package BlackJack;
import java.util.List;

public class GameAppWithMethds
{
    public static void roundOnePlayer(CardGame newGameAppCardGame,int playerTotal,int dealerTotal,List<String> displayhandPlayer,List<String> displayhandDealer,int aceValuePlayer,int aceValueDealer,Rules newGameAppRules)
    {
        System.out.println("Round One !");
        System.out.println();
        System.out.println("Player:");
        System.out.println("You are currently at " + aceValuePlayer);
        System.out.println("With the hand " + displayhandPlayer);
        System.out.println();

        System.out.println("Dealer:");
        System.out.println("You are currently at " + aceValueDealer);
        System.out.println("With the hand " + displayhandDealer);
        System.out.println();
    }

    public static void nextRoundPlayer(CardGame newGameAppCardGame,int aceValuePlayer)
    {
        System.out.println("Next Round !");
        System.out.println();
        System.out.println("Player:");
        System.out.println();
        System.out.println("You are currently at " + aceValuePlayer);
        System.out.printf("with the hand: ");
        for (Card card : newGameAppCardGame.playerHand)
        {
            System.out.printf("[%s, %s] ", card.Suit, card.Face);
        }
        System.out.println();
    }
    public static void nextRoundDealer(CardGame newGameAppCardGame,int aceValueDealer)
    {
        System.out.println("Dealer:");
        System.out.println("You are currently at " + aceValueDealer);
        System.out.printf("with the hand: ");
        for (Card card : newGameAppCardGame.dealerHand)
        {
            System.out.printf("[%s, %s] ", card.Suit, card.Face);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        String playerReply = "H";
        String dealerReply="H";
        CardGame newGameAppCardGame = new CardGame();
        Rules newGameAppRules = new Rules();
        newGameAppCardGame.shuffleCards();
        newGameAppCardGame.addCardsToPlayerHand(newGameAppCardGame.draw(2));
        newGameAppCardGame.addCardsToDealerHand(newGameAppCardGame.draw(2));
        int playerTotal = newGameAppCardGame.getHandValuePlayer();
        List<String> displayhandPlayer = newGameAppCardGame.displayHandPlayer();
        int aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);
        int dealerTotal = newGameAppCardGame.getHandValueDealer();
        List<String> displayhandDealer= newGameAppCardGame.displayHandDealer();
        int aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);
        roundOnePlayer(newGameAppCardGame,playerTotal, dealerTotal,displayhandPlayer,displayhandDealer,aceValuePlayer,aceValueDealer,newGameAppRules);
        playerReply = newGameAppRules.didPlayerWin(aceValuePlayer);
        dealerReply = newGameAppRules.didDealerWin(aceValueDealer);

        while(playerReply.equalsIgnoreCase("H"))
        {
            newGameAppCardGame.addCardsToPlayerHand(newGameAppCardGame.draw(1));
            playerTotal = newGameAppCardGame.getHandValuePlayer();
            aceValuePlayer = newGameAppRules.valueOfAce( playerTotal,displayhandPlayer);
            nextRoundPlayer(newGameAppCardGame,aceValuePlayer);
            playerReply = newGameAppRules.didPlayerWin(aceValuePlayer);
            dealerReply = newGameAppRules.didDealerWin(aceValueDealer);
        }
        while(dealerReply.equalsIgnoreCase("H"))
        {
            newGameAppCardGame.addCardsToDealerHand(newGameAppCardGame.draw(1));
            dealerTotal = newGameAppCardGame.getHandValueDealer();
            aceValueDealer = newGameAppRules.valueOfAce( dealerTotal,displayhandDealer);
            nextRoundDealer(newGameAppCardGame,aceValueDealer);
            dealerReply = newGameAppRules.didDealerWin(aceValueDealer);
        }
        newGameAppRules.ifBothStayed(dealerReply,playerReply,aceValuePlayer,aceValueDealer);
    }
}
