package Yatzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YatzeeRules
{
    public int chance(String diceChances)
    {
            String [] eachDice = diceChances.split(",");
             int chance = (Integer.parseInt(eachDice[0]) + Integer.parseInt(eachDice[1]) + Integer.parseInt(eachDice[2]) + Integer.parseInt(eachDice[3]) + Integer.parseInt(eachDice[4]));
            System.out.println("Press 1 For 'Chance '");
            System.out.println(chance);
        return chance;
    }
    public int yatzy(String diceYatzy)
    {
        int yatzyee = 0;
        String[] eachDice = diceYatzy.split(",");
        System.out.println("Press 2 For 'Yatzee '");
        for (int i = 0; i < eachDice.length; i++)
        {
            for (int j = i + 1; j < eachDice.length; j++)
            {
                if(eachDice[i].equals(eachDice[j]))
                    {
                        yatzyee = 50;
    //                    return yatzyee;
                    }
                else if((Integer.parseInt(eachDice[i]) != (Integer.parseInt(eachDice[j]))))
                    {
                        yatzyee = 0;
                        System.out.println(yatzyee);
                        return yatzyee;
                    }
            }
        }
        System.out.println(yatzyee);
        return yatzyee;
    }
    public int placedOnfours(String fours)
    {
        int total = 0;
        String []eachFour = fours.split(",");
        System.out.println("Press 3 For 'Placed on Fours '");
        for(int i = 0;i < eachFour.length;i++)
        {
            if(eachFour[i].contains("4"))
            {
                total = total + 4;
            }
        }
        System.out.println(total);
        return total;
    }
    public int placedOntwos(String twos)
    {
        int total = 0;
        String []eachFour = twos.split(",");
        System.out.println("Press 4 For 'Placed on Twos '");
        for(int i = 0;i < eachFour.length;i++)
        {
            if(eachFour[i].contains("2"))
            {
                total = total + 2;
            }
        }
        System.out.println(total);
        return total;
    }
    public int placedOnOnes(String ones)
    {
        int total = 0;
        String []eachFour = ones.split(",");
        System.out.println("Press 5 For 'Placed on ones '");
        for(int i = 0;i < eachFour.length;i++)
        {
           if(eachFour[i].contains("1"))
            {
                total = total + 1;
            }
        }
        System.out.println(total);
        return total;
    }
    public int pairs(String sumOfPairs)
    {
        int sum = 0;
        List pair = new ArrayList();
        List<String> eachDice = Arrays.asList(sumOfPairs.split(","));
        System.out.println("Press 6 For 'Pairs '");
        for (int i = 0; i < eachDice.size(); i++)
        {
            for (int j = i + 1; j < eachDice.size(); j++)
            {
                if (eachDice.get(i).equals(eachDice.get(j)))
                {
                    pair.add(eachDice.get(i));
                }
            }
        }
        System.out.println(pair);
        if(pair.size() == 2) {
            for (int i = 0; i < pair.size(); i++) {
                for (int j = i + 1; j < pair.size(); j++) {
                    if (Integer.parseInt((String) pair.get(i)) > Integer.parseInt((String) pair.get(j))) {
                        sum = 2 * (Integer.parseInt((String) pair.get(i)));
//                    System.out.println(sum);
                    } else {
                        sum = 2 * (Integer.parseInt((String) pair.get(j)));
//                        System.out.println(sum);
                    }
                }
            }
        }
        if(pair.size() == 1)
        {
            sum = 2 * (Integer.parseInt((String) pair.get(0)));
//            System.out.println(sum);
        }
        System.out.println(sum);
        return sum;
    }
    public int Twopairs(String sumOfTwoPairs)
    {
        int sum = 0;
        String[] eachDice = sumOfTwoPairs.split(",");
        System.out.println("Press 7 For 'Twos Pairs '");
        for (int i = 0; i < eachDice.length; i++)
        {
            for (int j = i + 1; j < eachDice.length; j++)
            {
                if(eachDice[i].equals(eachDice[j]))
                {
                    int Dice = Integer.parseInt(eachDice[i]);
                    sum = sum + (2*Dice);
                    eachDice[i] = String.valueOf(0);
                    eachDice[j] = String.valueOf(0);
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
    public int threeOfAKind(String threeValues)
    {
        int sum = 0;
        List pair = new ArrayList();
        List<String> eachDice = Arrays.asList(threeValues.split(","));
        System.out.println("Press 8 For 'Three Pairs '");
        for (int i = 0; i < eachDice.size(); i++) {
                for (int j = i + 1; j < eachDice.size(); j++) {
            if (eachDice.get(i).equals(eachDice.get(j))) {
                System.out.println(eachDice.get(i));
                pair.add(eachDice.get(i));
                System.out.println(pair);
                if (pair.size() == 3)
                {
                    sum = 3 * (Integer.parseInt(eachDice.get(i)));

                }
                if((pair.size() > 3) ||(pair.size()<3)){
                    sum = 0;
                }
            }}}
        System.out.println(sum);
        return sum;
    }
    public int fourOfAKind(String fourValues)
    {
        int sum = 0;
        List pair = new ArrayList();
        List<String> eachDice = Arrays.asList(fourValues.split(","));
        System.out.println("Press 9 For 'Four Pairs '");
        for (int i = 0; i < eachDice.size(); i++)
        {
            for (int j = i + 1; j < eachDice.size(); j++)
            {
                if (eachDice.get(i).equals(eachDice.get(j)))
                {
                    pair.add(eachDice.get(i));
                    if (pair.size() > 4)
                    {
                        sum = 4 * (Integer.parseInt(eachDice.get(i)));
                    }
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
    public int smallStraight(String smallStraightValues)
    {
        int sum =0;
            List<String> eachDice = Arrays.asList(smallStraightValues.split(","));
        System.out.println("Press 10 For 'Small Straight '");
                if(eachDice.contains("1") && eachDice.contains("2") && eachDice.contains("3") && eachDice.contains("4") && eachDice.contains("5"))
                {
                    sum = 15;
                }
        System.out.println(sum);
        return sum;
    }
    public int fullHouse(String fullHouseValue)
    {
        int sum =0;
        int sum3Values = 0;
        int sum2Values = 0;
        List pair = new ArrayList();
        ArrayList<String> eachDice = new ArrayList<>(Arrays.asList(fullHouseValue.split(",")));
        System.out.println("Press 11 For 'Full House '");
        String value ="0";
        for(int i =0; i < eachDice.size() ; i++)
        {
            for(int j = i+1; j < eachDice.size();j++)
            {
                if (eachDice.get(i).equals(eachDice.get(j)))
                {
                    pair.add(eachDice.get(i));
                    if(pair.size() == 3)
                    {
                        sum3Values = 3 * (Integer.parseInt( eachDice.get(i)));
//                        System.out.println(sum3Values);
                        value = Integer.toString(sum3Values/3);
                    }
                }
//                System.out.println(eachDice);
                eachDice.remove(value);
//                System.out.println(eachDice);
            }
        }
        if(eachDice.get(0).equals(eachDice.get(1)))
        {
            sum2Values = (Integer.parseInt(eachDice.get(0)) + Integer.parseInt(eachDice.get(1)));
//            System.out.println(sum2Values);
            sum = sum3Values + sum2Values;
        }

        System.out.println(sum);
       return sum;
    }

}