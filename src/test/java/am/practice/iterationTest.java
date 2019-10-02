package am.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class iterationTest {

    @Test
    public void checkBinaryGaps() {
        assertEquals(2, iteration.findBinaryGap(9));
        assertEquals(4, iteration.findBinaryGap(529));
        assertEquals(1, iteration.findBinaryGap(20));
        assertEquals(5, iteration.findBinaryGap(1041));

    }

    @Test
    public void checkZeroBinaryGaps(){
        assertEquals(0, iteration.findBinaryGap(15));
        assertEquals(0, iteration.findBinaryGap(1));
        assertEquals(0, iteration.findBinaryGap(0));
        assertEquals(0, iteration.findBinaryGap(32));

    }
}