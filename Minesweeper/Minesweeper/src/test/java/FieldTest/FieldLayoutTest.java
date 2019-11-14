package FieldTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldLayoutTest
{
    Field.FieldLayout fieldLayout = new Field.FieldLayout("35");
    @Test
    public void returnNumberOfRows()
    {
        assertEquals(3,fieldLayout.calculatingNumberOfRows("35"));
    }
    @Test
    public void returnsNumberOfColumns()
    {
        assertEquals(5,fieldLayout.calculatingNumberOfColumns("35"));
    }
}
