package Field;

public class FieldLayout
{
        String fieldLayout;
        String numberOfRows;
        String numberOfColumns;

    public FieldLayout(String fieldLayout) {
       this.fieldLayout = fieldLayout;
    }
    public int calculatingNumberOfRows(String layout){
        String[] fieldLayout = (layout.split(""));
        numberOfRows = (fieldLayout[0]);
        return Integer.parseInt(numberOfRows);
    }
    public int calculatingNumberOfColumns(String layout){
        String[] fieldLayout = (layout.split(""));
        numberOfColumns = (fieldLayout[1]);
        return Integer.parseInt(numberOfColumns);
    }

    @Override
    public String toString() {
        return "Field.FieldLayout{" +
                "fieldLayout='" + fieldLayout + '\'' +
                '}';
    }
}
