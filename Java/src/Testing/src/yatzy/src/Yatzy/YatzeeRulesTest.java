package Yatzy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YatzeeRulesTest
{
    YatzeeRules yatzeeRules = new YatzeeRules();
    @Test
    public void testChance()
    {
        assertEquals(14, yatzeeRules.chance("1,1,3,3,6"));
    }
    @Test
    public void testyatzy()
    {
        assertEquals(50, yatzeeRules.yatzy("1,1,1,1,1"));
        assertEquals(0, yatzeeRules.yatzy("1,1,1,2,1"));
    }
    @Test
    public void testplacedOnfours()
    {
        assertEquals(8, yatzeeRules.placedOnfours("1,1,2,4,4"));
//        assertEquals(4, yatzeeRules.placedOntwos("2,3,2,5,1"));
//        assertEquals(0, yatzeeRules.placedOnOnes("3,3,3,4,5"));
    }
    @Test
    public void testpairs()
    {
        assertEquals(0, yatzeeRules.pairs("3,1,3,3,2"));
    }
    @Test
    public void testTwoPairs()
    {
        assertEquals(2, yatzeeRules.Twopairs("1,2,3,1,1"));
    }
    @Test
    public void testthreeOfAKind()
    {
        assertEquals(6, yatzeeRules.threeOfAKind("2,1,2,1,2"));
    }
    @Test
    public void testfourOfAKind()
    {
        assertEquals(8, yatzeeRules.fourOfAKind("2,2,4,2,2"));
    }
    @Test
    public void testSmallStraight()
    {
        assertEquals(15, yatzeeRules.smallStraight("1,5,3,4,2"));
    }
    @Test
    public void testFullHouse()
    {
        assertEquals(8, yatzeeRules.fullHouse("2,1,2,1,2"));
    }
}
