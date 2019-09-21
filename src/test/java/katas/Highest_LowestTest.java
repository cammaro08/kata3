package katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Highest_LowestTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void returnWithHigherNumber(){
        assertEquals("4 2",Highest_Lowest.highAndLow("2 4"));
    }


    @Test
    public void returnWithHigherNegativeNumber(){
        assertEquals("-2 -4", "-2 -4");
    }

    @Test
    public void returnHighestAndLowest() {
        assertEquals("42 -9", Highest_Lowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
