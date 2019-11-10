import java.util.ArrayList;

public class Field {
    ArrayList field;
    String fieldLayout;

    public Field(String fieldLayout, ArrayList field) {
        this.field = field;
        this.fieldLayout = fieldLayout;
    }

    public ArrayList getField() {
        return field;
    }

    @Override
    public String toString() {
        return "Field{" +
                "field=" + field +
                ", fieldLayout=" + fieldLayout +
                '}';
    }
}
