import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FieldTest
{
    @Test
    public void fieldReturnsField(){
        String fieldLayout = "22";
        ArrayList field = new ArrayList();
        field.add(".");
        field.add("*");
        field.add(".");
        field.add(".");
        Field fieldContent = new Field(fieldLayout,field);
        assertEquals(field,fieldContent.getField());
    }
}
