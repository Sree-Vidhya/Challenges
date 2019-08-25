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
        List<String> hand = new ArrayList<>();
        //player Loop
        for (int i = 0; i < 2; i++) {
            int j = 0;
            List<String> playerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                    playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
            playerHand.add(playerCard);
            int size = playerCard.size();
            for (int k = 0; k < size / 2; k++) {
                String total1 = playerCard.get(k);
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

        }

        System.out.println("You are currently at " + finalPlayerTotal);
        System.out.println("with the hand " + playerHand);
        //Dealer Loop
        for (int j = 0; j < 2; j++) {
            int i = 0;
            List<String> dealerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                    playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
            dealerHand.add(dealerCard);
                String total1 = dealerCard.get(0);
                if (total1.equals("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '")) {
                    total1 = "10";
                } else if ((total1.equals("'ACE '") && dealerTotal < 11)) {
                    total1 = "11";
                } else if ((total1.equals("'ACE '") && playerTotal < 11)) {
                    total1 = "1";
                }
                dealerTotal = Integer.parseInt(total1);
                finalDealerTotal = finalDealerTotal + dealerTotal;
            }
        System.out.println("Dealer:");
        System.out.println("You are currently at " + finalDealerTotal);
        System.out.println("with the hand " + dealerHand);

        System.out.println("Hit or Stay? \nPress H for hit \nPress S for stay");
        reply = input.nextLine();
        while (reply.equalsIgnoreCase("H")) {
            if(finalPlayerTotal <21){
                int i =0;
                int j =0;
                    List<String> playerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                            playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
                playerHand.add(playerCard);
                        String total1 = playerCard.get(0);
                        if (total1.equals ("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '") ) {
                            total1 = "10";
                        }
                        else if ((total1.equals("'ACE '") && finalPlayerTotal < 11)) {
                            total1 = "11";
                        }
                        else if (total1.equals("'ACE '") ){
                            total1 = "1";
                        }
                        playerTotal = Integer.parseInt(total1);
                        finalPlayerTotal = finalPlayerTotal+ playerTotal;
                System.out.println("You are currently at " + finalPlayerTotal);
                System.out.println("with the hand " + playerHand);
            }

            else if(finalPlayerTotal == 21){
                System.out.println("You Win!! Congrats!..");
            }
            else if(finalPlayerTotal > 21){
                System.out.println("BUSTED!!");
            }
            System.out.println("Press H to Hit");
            reply = input.nextLine();
        }
        if(reply.equalsIgnoreCase("s")) {
            System.out.println("Hit or Stay? \nPress H for hit \nPress S for stay");
        }
        reply = input.nextLine();
        while (reply.equalsIgnoreCase("H")) {
            if(finalDealerTotal <21){
                int i =0;
                int j =0;
                List<String> dealerCard = LoopMthd(hand, min, min1, max, max1, cardValue, suits, total,
                        playerTotal, dealerTotal, playerHand, dealerHand, i, j, input);
                playerHand.add(dealerCard);
                String total1 = dealerCard.get(0);
                if (total1.equals ("'JACK '") || total1.equals("'KING '") || total1.equals("'QUEEN '") ) {
                    total1 = "10";
                }
                else if ((total1.equals("'ACE '") && finalDealerTotal < 11)) {
                    total1 = "11";
                }
                else if (total1.equals("'ACE '") ){
                    total1 = "1";
                }
                dealerTotal = Integer.parseInt(total1);
                finalDealerTotal = finalDealerTotal+ dealerTotal;
                System.out.println("You are currently at " + finalDealerTotal);
                System.out.println("with the hand " + playerHand);
            }

            else if(finalDealerTotal == 21){
                System.out.println("You Win!! Congrats!..");
            }
            else if(finalDealerTotal > 21){
                System.out.println("BUSTED!!");
            }
            System.out.println("Press H to Hit");
            reply = input.nextLine();}
    }}



