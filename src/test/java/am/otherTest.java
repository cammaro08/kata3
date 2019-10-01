package am;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class otherTest {

    @Test
    public void returnOneWhenOne() {
        int[] input = new int[]{1};
        int[] expected = new int[]{1};
        assertEquals(Arrays.toString(expected), other.coinDenomiation(input,1));
    }


    @Test
    public void return_TwentyTwenty_When_Forty() {
        int[] input = new int[]{20,10};
        int[] expected = new int[]{20,20};
        assertEquals(Arrays.toString(expected), other.coinDenomiation(input,40));
    }



//    @Test
//    public void returnWithCorrectDenominations() {
//
//        int[] input = new int[]{20,10,5,1};
//        int[] expected = new int[]{20,20,10,1,1,1};
//        assertEquals(expected,(input,53));
//    }






}