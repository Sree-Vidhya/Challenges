import Validation.FieldInput;
import Validation.ValidateFieldContent;
import Validation.ValidateFieldLayout;

public class Application {
    public static void main(String[] args) {
        ValidateFieldLayout validateLayout = new ValidateFieldLayout();
        FieldInput input = new FieldInput();
        ValidateFieldContent validateContent = new ValidateFieldContent(input);
        System.out.println(validateContent.fieldCreated(validateContent.calculateToTalNumberofcells(validateLayout.enterFieldLayout())));
    }
}
