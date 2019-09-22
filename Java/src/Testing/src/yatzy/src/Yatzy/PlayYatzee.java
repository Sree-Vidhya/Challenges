package Yatzy;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class PlayYatzee {
    public static String generateDiceValues()
    {
        ArrayList<String> rollFrom5Dice = new ArrayList<String>();
        for(int count = 0; count < 5; count ++)
        {
            int rollfromDice;
            int min = 1;
            int max = 6;
            rollfromDice = ThreadLocalRandom.current().nextInt(min, max + 1);
            rollFrom5Dice.add(Integer.toString(rollfromDice));
            System.out.println(rollFrom5Dice);
        }
        String convertRollfrom5toString = String.valueOf(rollFrom5Dice);
        String removeOpenSquareBracket =  convertRollfrom5toString.replace("[","");
        String removeCloseSquareBracket = removeOpenSquareBracket.replace("]","");
        String removeSpace = removeCloseSquareBracket.replace(" ","");
        System.out.println(removeSpace);
        return removeSpace;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        String reply;
        Boolean state = false;
        YatzeeRules playTheGame = new YatzeeRules();
        String rollChoice;
        String DiceRoll;
        do{
            do{
                DiceRoll = generateDiceValues();
        playTheGame.chance(DiceRoll);
        playTheGame.yatzy(DiceRoll);
        playTheGame.placedOnOnes(DiceRoll);
        playTheGame.placedOnfours(DiceRoll);
        playTheGame.pairs(DiceRoll);
        playTheGame.threeOfAKind(DiceRoll);
        playTheGame.fourOfAKind(DiceRoll);
        playTheGame.smallStraight(DiceRoll);
        playTheGame.fullHouse(DiceRoll);
        System.out.println("Do you want to roll again?");
        rollChoice = input.nextLine();
            }while(rollChoice.equals( "0"));
            System.out.println("Select your combination");
            String choice = input.nextLine();
            switch (choice)
            {
                case "1":
                    if(state == false) {
                        int chance = playTheGame.chance(DiceRoll);
                        total = total + chance;
                        System.out.println("total " + total);
                        state = true;
                    }
                    break;
                    case "2":

                        int yatzee = playTheGame.yatzy(DiceRoll);
                        total = total + yatzee;
                        System.out.println("total " + total);
                        break;
                    case "3":
                        int placedOnfours = playTheGame.placedOnfours(DiceRoll);
                        total = total + placedOnfours;
                        System.out.println("total " + total);
                        break;
                    case "4":
                        int placedOntwos = playTheGame.placedOntwos(DiceRoll);
                        total = total + placedOntwos;
                        System.out.println("total " + total);
                        break;
                    case "5":
                        int placedOnOnes = playTheGame.placedOnOnes(DiceRoll);
                        total = total + placedOnOnes;
                        System.out.println("total " + total);
                        break;
                    case "6":
                        int pairs = playTheGame.pairs(DiceRoll);
                        total = total + pairs;
                        System.out.println("total " + total);
                        break;
                    case "7":
                        int Twopairs = playTheGame.Twopairs(DiceRoll);
                        total = total + Twopairs;
                        System.out.println("total " + total);
                        break;
                    case "8":
                        int threeOfAKind = playTheGame.threeOfAKind(DiceRoll);
                        total = total + threeOfAKind;
                        System.out.println("total " + total);
                        break;
                    case "9":
                        int fourOfAKind = playTheGame.fourOfAKind(DiceRoll);
                        total = total + fourOfAKind;
                        System.out.println("total " + total);
                        break;
                    case "10":
                        int smallStraight = playTheGame.smallStraight(DiceRoll);
                        total = total + smallStraight;
                        System.out.println("total " + total);
                        break;
                    case "11":
                        int fullHouse = playTheGame.fullHouse(DiceRoll);
                        total = total + fullHouse;
                        System.out.println("total " + total);
                        break;
            }
            System.out.println("Do you want to continue?");
            reply = input.nextLine();
        }
        while (reply.equalsIgnoreCase("y"));
    }
}
