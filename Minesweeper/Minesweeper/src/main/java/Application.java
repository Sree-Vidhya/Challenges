import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;


public class Application {
    public static void main(String[] args) {
        FieldInput input = new FieldInput();
        ValidateFieldLayout validateLayout = new ValidateFieldLayout(input);
        ValidateFieldContent validateContent = new ValidateFieldContent(input);
        Game game = new Game(input,validateLayout,validateContent);
        game.totalNumberOfCells(game.matrixLayout());
        System.out.println(game.entireField());
    }
}
