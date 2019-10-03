package am.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class oddOccurencesInArrayTest {

    @Test
    public void WhenSinglePairPresent(){
        int[] test = new int[]{1,2,1};
        assertEquals(2,oddOccurencesInArray.oddOccuranceInArray(test));
    }

    @Test
    public void WhenMultiplePairsPresent(){
        int[] test = new int[]{9,3,9,3,9,7,9};
        assertEquals(7,oddOccurencesInArray.oddOccuranceInArray(test));
    }

}