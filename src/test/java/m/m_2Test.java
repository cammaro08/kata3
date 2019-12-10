package m;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class m_2Test {

    @Test
    public void returnsSquareOfANumber() {
        assertEquals(4, m2.returnSquare(2));
    }


    @Test
    public void returnZeroWhenInputZero() {
        assertEquals(0, m2.checkIfHappyNumber(0));
    }


    @Test
    public void returnOneWhenInputOne() {
        assertEquals(1, m2.checkIfHappyNumber(1));
    }

    @Test
    public void returnSumOfSquares() {
        assertEquals(20, m2.returnSumOfSplitNumberAndSquare(24));
        assertEquals(21, m2.returnSumOfSplitNumberAndSquare(241));
        assertEquals(25, m2.returnSumOfSplitNumberAndSquare(2421));
        assertEquals(0, m2.returnSumOfSplitNumberAndSquare(0));
        assertEquals(1, m2.returnSumOfSplitNumberAndSquare(1));
    }

    @Test
    public void returnTrueIfNumberPresent() {
        List<Integer> aList = new ArrayList<Integer>();
        aList.add(89);
        aList.add(224);
        aList.add(2);
        aList.add(1380);
        assertTrue(m2.checkIfNumberInArray(2, aList));
    }

    @Test
    public void returnOneWhenInputSeven(){
        assertEquals(1, m2.checkIfHappyNumber(7));
    }

    @Test
    public void returnZeroWhenInputTwentyTwo(){
        assertEquals(0, m2.checkIfHappyNumber(22));

    }

}