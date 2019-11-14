package FieldTest;

import Field.FieldValues;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FieldValuesTest
{
    @Test
    public void fieldReturnsField(){
        String fieldLayout = "22";
        ArrayList field = new ArrayList();
        field.add(".");
        field.add("*");
        field.add(".");
        field.add(".");
        FieldValues fieldValues = new FieldValues(fieldLayout,field);
        assertEquals(field, fieldValues.getField());
    }
}
