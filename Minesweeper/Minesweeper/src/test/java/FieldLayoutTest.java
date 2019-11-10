import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FieldLayoutTest
{
    FieldLayout fieldLayout = new FieldLayout("35");
    @Test
    public void returnNumberOfRows()
    {
        assertEquals("3",fieldLayout.calculatingNumberOfRows());
    }
    @Test
    public void returnsNumberOfColumns()
    {
        assertEquals("5",fieldLayout.calculatingNumberOfColumns());
    }
}
