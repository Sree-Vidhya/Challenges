package Yatzy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Trial {
    public static void main(String[] args) {
        String threeValues = "2,1,2,1,2";
            int sum = 0;
            List pair = new ArrayList();
            List<String> eachDice = Arrays.asList(threeValues.split(","));
            System.out.println("Press 8 For 'Three Pairs '");
            for (int i = 0; i < eachDice.size(); i++) {
//                for (int j = i + 1; j < eachDice.size(); j++) {
                    if (eachDice.get(i).equals(eachDice.get(1))) {
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
                    }}
            System.out.println(sum);
    }
}
