package m;

import org.junit.Test;

import static org.junit.Assert.*;

public class m4Test {

    @Test
    public void returnZeroWhenInputZero() {
        assertEquals("0", m4.checkIfHappyNumber("0"));
    }

    @Test
    public void returnOneWhenInputOne(){
        assertEquals("1", m4.checkIfHappyNumber("1"));
    }

    @Test
    public void returnSumOfSquares(){
        assertEquals("4", m4.returnSumOfSquares("20"));
        assertEquals("26", m4.returnSumOfSquares("51"));
        assertEquals("25", m4.returnSumOfSquares("34"));
    }

    @Test
    public void checkIfHappyNumber(){
        assertEquals("1", m4.checkIfHappyNumber("7"));
        assertEquals("0", m4.checkIfHappyNumber("22"));

    }
}