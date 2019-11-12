import Game.GameInput;
import Game.GameOutput;
import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;


public class Application {
    public static void main(String[] args) {
        FieldInput input = new FieldInput();
        ValidateFieldLayout validateLayout = new ValidateFieldLayout(input);
        ValidateFieldContent validateContent = new ValidateFieldContent(input);
        GameInput gameInput = new GameInput(input,validateLayout,validateContent);
        GameOutput gameOutput = new GameOutput(gameInput);
        gameOutput.calc(gameOutput.displayOutput());
    }
}
