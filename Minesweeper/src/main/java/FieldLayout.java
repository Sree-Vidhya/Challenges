public class FieldLayout
{
        String layout;
        String numberOfRows;
        String numberOfColumns;

    public FieldLayout(String layout) {
       this.layout = layout;
    }
    public String calculatingNumberOfRows(){
        String[] fieldLayout = (layout.split(""));
        numberOfRows = (fieldLayout[0]);
        return numberOfRows;
    }
    public String calculatingNumberOfColumns(){
        String[] fieldLayout = (layout.split(""));
        numberOfColumns = (fieldLayout[1]);
        return numberOfColumns;
    }

    @Override
    public String toString() {
        return "FieldLayout{" +
                "layout='" + layout + '\'' +
                '}';
    }
}
