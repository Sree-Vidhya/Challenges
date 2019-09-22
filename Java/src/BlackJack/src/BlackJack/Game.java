package BlackJack;

import java.util.List;
import java.util.Scanner;

public class Game
{

    public static void main(String[] args)
    {
        startGame();
    }

    private static void startGame() {
        Scanner input = new Scanner(System.in);
        String playerReply;
        String dealerReply = "H";
        FiftyTwoCardDeck roundOone = new FiftyTwoCardDeck();
        Player roundOonePlayer = new Player();
        Dealer roundOoneDealer = new Dealer();
        System.out.println(roundOone.fiftyTwoCardDeck());
        System.out.println("ROUND ONE");
        System.out.println();

        System.out.println("Player:");
        roundOone.shuffleCards();
        roundOonePlayer.addCardsToHand(roundOone.draw(2));
        System.out.println("You are at currently at " + roundOonePlayer.getHandValuePlayer());
        System.out.println("with the hand " + roundOonePlayer.displayHandPlayer());
        System.out.println();

        System.out.println("Dealer:");
        roundOoneDealer.addCardsToHand(roundOone.draw(2));
        System.out.println("You are at currently at " + roundOoneDealer.getHandValueDealer());
        System.out.println("with the hand " + roundOoneDealer.displayHandDealer());
        System.out.println();

        do {
            System.out.println("Player Next Round:");
            System.out.println("Do you want to hit or stay: \nH for hit \nS for stay");
            playerReply = input.nextLine();
            while (playerReply.equalsIgnoreCase("H")) {
                System.out.println("Player Next Round:");
                roundOonePlayer.addCardsToHand(roundOone.draw(1));
                System.out.println("You are at currently at " + roundOonePlayer.getHandValuePlayer());
                System.out.printf("with the hand: ");
                for (Card card : roundOonePlayer.hand
                ) {
                    System.out.printf("[%s, %s] ", card.Suit, card.Face);
                }
                System.out.println();
                roundOonePlayer.didPlayerWin();
                roundOonePlayer.didPlayerBust();
                System.out.println("Do you want to hit or stay: \nH for hit \nS for stay");
                playerReply = input.nextLine();
            }
            if (playerReply.equalsIgnoreCase("S")) {
                roundOoneDealer.shouldDealerContinue(roundOoneDealer);
                while (dealerReply.equalsIgnoreCase("H")) {
                    System.out.println();
                    roundOoneDealer.addCardsToHand(roundOone.draw(1));
                    System.out.println("Dealer Round");
                    System.out.println("You are at currently at " + roundOoneDealer.getHandValueDealer());
                    System.out.printf("with the hand: ");
                    for (Card card : roundOoneDealer.hand
                    ) {
                        System.out.printf("[%s, %s] ", card.Suit, card.Face);
                    }
                    System.out.println();
                    roundOoneDealer.didDealerWin();
                    roundOoneDealer.didDealerBust();
                    roundOoneDealer.shouldDealerContinue(roundOoneDealer);
                }
            }
        }while((dealerReply.equalsIgnoreCase("S")));
}}
