import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();
    @Test
    public void testMain()
    {
        assertEquals(2,main.returnZero(9,2));
    }
}