package Game;

import java.util.ArrayList;

public class example {
    public int number = 3;
    public ArrayList<Integer> playerArr = new ArrayList<>();

    public void IncreaseByOne(){
        this.number += 1;
    }

    public void IncreaseByX(int number2){
        this.number += number2;
    }

    private void welcome(){
        // do things
        this.clearPlayer();
        this.playerArr.add(1);
    }
    private void clearPlayer(){
        this.playerArr.removeAll(this.playerArr);
    }
}
