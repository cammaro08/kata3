package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class Shortest_WordTest {

    @Test
    public void returnLengthOfOneWord() {
        assertEquals(3,Shortest_Word.findShort("lol"));
    }


//    @Test
//    public void returnLengthOfTwoWord() {
//        assertEquals(6,Shortest_Word.findShort("lol lol"));
//    }

    @Test
    public void returnShortestLengthOfTwoWord() {
        assertEquals(3,Shortest_Word.findShort("lol lool"));
    }


//    @Test
//    public void findSortWordLengthFromManyWords() throws Exception {
//        assertEquals(3, Shortest_Word.findShort("bitcoin take over the world maybe who knows perhaps"));
//        assertEquals(3, Shortest_Word.findShort("turns out random test cases are easier than writing out basic ones"));
//    }

}