package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class Vowel_CountTest {

    @Test
    public void checkVowelA(){
        assertEquals(1,Vowel_Count.getCount("abc"));
    }
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowel_Count.getCount("abracadabra"));
    }



}