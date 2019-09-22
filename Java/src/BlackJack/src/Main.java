import BlackJack.FiftyTwoCardDeck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static List SuitsMthd(int suits, List hand, List player){
        switch (suits) {
            case 1:
                hand.add(" 'SPADE ' ");
                break;
            case 2:
                hand.add(" 'CLUB '");
                break;
            case 3:
                hand.add("'DIAMOND '");
                break;
            case 4:
                hand.add("'HEARTS '");
                break;
            default:
                System.exit(0);
        }
        return hand;
    }

    static List LoopMthd (List hand, int min, int min1, int max, int max1, int cardValue, int suits, int total, int playerTotal, int dealerTotal, List player, List dealer, int i, int j, Scanner input){
            hand = new ArrayList<>();
            cardValue = ThreadLocalRandom.current().nextInt(min, max + 1);
            String strCardValue = Integer.toString(cardValue);
            suits = ThreadLocalRandom.current().nextInt(min1, max1 + 1);
            if (cardValue < 11) {
                hand.add(strCardValue);
                total = total + cardValue;
            } else {
                switch (cardValue) {
                    case 11:
                        hand.add("'JACK '");
                        total = total + 10;
                        break;
                    case 12:
                        hand.add("'KING '");
                        total =  total +10;
                        break;
                    case 13:
                        hand.add("'QUEEN '");
                        total = total + 10;
                        break;
                    case 14:
                        hand.add("'ACE '");
                        if (playerTotal < 11|| dealerTotal < 11) {
                        total = 11;
                    } else {
                        total = 1;
                    }
                        break;

                    default:
                        System.exit(0);
                }
            }
            SuitsMthd(suits, hand, player);
            return hand;
    }

    public static void PlayerConditionMthd(int finalPlayerTotal, int finalDealerTotal){
        Scanner input = new Scanner(System.in);
        String reply = "See you soon";
        if((finalPlayerTotal ==21) && (finalDealerTotal == 21)){
            System.out.println("It's a tie");
        }
        else if(finalPlayerTotal == 21){
            System.out.println("You beat the dealer!! Congrats!..");
            System.exit(0);
        }
        else if(finalDealerTotal == 21){
            System.out.println("Dealer Wins!!!..");
            System.exit(0);
        }
        else if(finalPlayerTotal > 21){
            System.out.println("BUSTED!! and the dealer Wins");
            System.exit(0);
        }
        else if(finalDealerTotal > 21){
            System.out.println("BUSTED!! and the player wins");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<List<String>> playerHand = new ArrayList<>();
        List<List<String>> dealerHand = new ArrayList<>();
        String reply;
        int finalPlayerTotal = 0;
        int finalDealerTotal = 0;
        int playerTotal = 0;
        int dealerTotal = 0;
        int min = 2;
        int max = 14;
        int min1 = 1;
        int max1 = 4;
        int cardValue = 0;
        int total = 0;
        int suits = 0;
        int round = 2;
        String DealerReply;
        String PlayerReply;
        List<String> hand = new ArrayList<>();
//        FiftyTwoCardDeck myDeck = new FiftyTwoCardDeck();
//        myDeck.Draw()

        //player Loop round 1
        for (int i = 0; i < 2; i++) {
            int j = 0;
            List<String> playerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                    playerTotal, dealerTotal, (List) playerHand, dealerHand, i, j, input);
            playerHand.add(playerCard);
            String total1 = playerCard.get(0);
            if (total1.equals("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '")) {
                total1 = "10";
            } else if ((total1.equals("'ACE '") && playerTotal < 11)) {
                total1 = "11";
            } else if (total1.equals("'ACE '") && dealerTotal < 11) {
                total1 = "1";
            }
            playerTotal = Integer.parseInt(total1);
            finalPlayerTotal = finalPlayerTotal + playerTotal;

        }
        System.out.println("Player:");
        System.out.println("You are currently at " + finalPlayerTotal);
        System.out.println("with the hand " + playerHand);
        //Dealer Loop round 1
        for (int j = 0; j < 2; j++) {
            int i = 0;
            List<String> dealerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                    playerTotal, dealerTotal, (List) playerHand, dealerHand, i, j, input);
            dealerHand.add(dealerCard);
            String total1 = dealerCard.get(0);
            if (total1.equals("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '")) {
                total1 = "10";
            } else if ((total1.equals("'ACE '") && dealerTotal < 11)) {
                total1 = "11";
            } else if (total1.equals("'ACE '") && playerTotal < 11) {
                total1 = "1";
            }
            dealerTotal = Integer.parseInt(total1);
            finalDealerTotal = finalDealerTotal + dealerTotal;
        }
        System.out.println("Dealer:");
        System.out.println("You are currently at " + finalDealerTotal);
        System.out.println("with the hand " + dealerHand);

        //Next Round
        PlayerConditionMthd(finalPlayerTotal, finalDealerTotal);
        round = round +1;
        System.out.println("Round: " + round);
        System.out.println("Do You want to hit or stay?");
        PlayerReply = input.nextLine();
        int i = 0;
        int j = 0;
        do {
            while (PlayerReply.equalsIgnoreCase("H")) {
                System.out.println("Player Choice");
                List<String> playerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                        playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
                playerHand.add(playerCard);
                String total1 = playerCard.get(0);
                if (total1.equals("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '")) {
                    total1 = "10";
                }
                else if ((total1.equals("'ACE '") && finalPlayerTotal < 11)) {
                    total1 = "11";
                } else if ((total1.equals("'ACE '") && finalPlayerTotal > 11)) {
                    total1 = "1";
                }
                try {

                    playerTotal =  Integer.parseInt(total1);
                } catch (NumberFormatException e){
                    //something went wrong
                }
                finalPlayerTotal = finalPlayerTotal + playerTotal;
                System.out.println("Player: ");
                System.out.println("You are currently at " + finalPlayerTotal);
                System.out.println("with the hand " + playerHand);
                PlayerConditionMthd(finalPlayerTotal, finalDealerTotal);
                System.out.println("Player choice \nDo You want to hit or stay?");
                PlayerReply = input.nextLine();
            }
            //Dealer Condition check
            if (PlayerReply.equalsIgnoreCase("S")) {
                System.out.println("Dealer choice");
                System.out.println("Do You want to hit or stay?");
            }
                DealerReply = input.nextLine();
            while ((finalDealerTotal < 17) && DealerReply.equalsIgnoreCase("s")){
                System.out.println("Since your total is less than 17, please select H");
                DealerReply = input.nextLine();
            }
                while (DealerReply.equalsIgnoreCase("h")) {
                    List<String> dealerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                            playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
                    dealerHand.add(dealerCard);
                    String total2 = dealerCard.get(0);
                    if ( total2.equals("'JACK '") || total2.equals("'KING '") || total2.equals("'QUEEN '")) {
                        total2 = "10";
                    }
                    else if ((total2.equals("'ACE '") && finalDealerTotal < 11)) {
                        total2 = "11";
                    } else if ((total2.equals("'ACE '") && finalDealerTotal > 11)) {
                        total2 = "1";
                    }
                    try {

                        dealerTotal = Integer.parseInt(total2);
                    } catch (NumberFormatException e){
                        //something went wrong
                    }
                    System.out.println("Dealer: ");
                    finalDealerTotal = finalDealerTotal + dealerTotal;
                    System.out.println("You are currently at " + finalDealerTotal);
                    System.out.println("with the hand " + dealerHand);
                    PlayerConditionMthd(finalPlayerTotal, finalDealerTotal);
                    System.out.println("Dealer choice \nDo You want to hit or stay?");
                    DealerReply = input.nextLine();
                    PlayerConditionMthd(finalPlayerTotal, finalDealerTotal);
                    while ((finalDealerTotal < 17) && DealerReply.equalsIgnoreCase("s")){
                        System.out.println("Since your total is less than 17, please select H");
                        DealerReply = input.nextLine();
                    }
            }
            round = round +1;
            System.out.println("Round: " + round);
            if(round > 3){
                finalDealerTotal = 21-finalDealerTotal;
                finalPlayerTotal = 21-finalPlayerTotal;
                System.out.println("FD " + finalDealerTotal);
                System.out.println(" PD "+ finalPlayerTotal);
                if(finalDealerTotal < finalPlayerTotal){
                    System.out.println("Dealer Wins!!");
                    System.exit(0);
                }
                else if(finalDealerTotal == finalPlayerTotal){
                    System.out.println("It's a tie!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Player Wins!!");
                    System.exit(0);
                }
            }
            System.out.println("Player choice \nDo You want to hit or stay?");
            PlayerReply = input.nextLine();
        }while (PlayerReply.equalsIgnoreCase("h") || PlayerReply.equalsIgnoreCase("s"));
    }}



