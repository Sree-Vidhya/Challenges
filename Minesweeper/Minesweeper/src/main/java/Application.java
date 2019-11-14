import Game.GameInput;
import Game.GameOutput;
import Game.GameLogic.LogicForAdjacentCells;
import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;

public class Application {
    public static void main(String[] args) {
        String layoutValues = null;
        FieldInput input = new FieldInput();
        ValidateFieldLayout validateLayout = new ValidateFieldLayout(input);
        ValidateFieldContent validateContent = new ValidateFieldContent(input);
        GameInput gameInput = new GameInput(input,validateLayout,validateContent);
        LogicForAdjacentCells adjacentCells = new LogicForAdjacentCells(gameInput);
        GameOutput gameOutput = new GameOutput(gameInput,adjacentCells);
        gameOutput.displayOutput(gameInput);

    }
}
