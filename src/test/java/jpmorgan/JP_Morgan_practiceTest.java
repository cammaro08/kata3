package jpmorgan;

import org.junit.Test;

import static org.junit.Assert.*;

public class JP_Morgan_practiceTest {

    @Test
    public void returnZeroWhenInputZero() {
        assertEquals("0",JP_Morgan_practice.checkIfHappyNumber("0"));
    }

    @Test
    public void returnOneWhenInputOne(){
        assertEquals("1",JP_Morgan_practice.checkIfHappyNumber("1"));
    }

    @Test
    public void returnSumOfSquares(){
        assertEquals("4",JP_Morgan_practice.returnSumOfSquares("20"));
        assertEquals("26",JP_Morgan_practice.returnSumOfSquares("51"));
        assertEquals("25",JP_Morgan_practice.returnSumOfSquares("34"));
    }

    @Test
    public void checkIfHappyNumber(){
        assertEquals("1",JP_Morgan_practice.checkIfHappyNumber("7"));
        assertEquals("0",JP_Morgan_practice.checkIfHappyNumber("22"));

    }
}