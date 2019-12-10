package rck;

import org.junit.Test;

import static org.junit.Assert.*;

public class rck3Test {

    @Test
    public void findSingleWordInSingleBlob(){
        assertEquals("1|1", rck3.numberOfPatternMatched("a","ab"));
        assertEquals("2|2", rck3.numberOfPatternMatched("a","aba"));
        assertEquals("4|4", rck3.numberOfPatternMatched("a","abaopopoaklklkap"));
    }

    @Test
    public void lolz(){
        assertEquals("4|1|2|7", rck3.numberOfPatternMatched("aa","aabaaopopoaaklklkaap|aab|aaaoaa"));
    }


    @Test
    public void findSingleWordInMultipleBlobs(){
        assertEquals("1|1|2", rck3.numberOfPatternMatched("a","ab|ab"));
        assertEquals("4|1|2|7", rck3.numberOfPatternMatched("a","abaopopoaklklkap|ab|aao"));

    }


    @Test
    public void findTwoWordsInMultipleBlobs(){
        assertEquals("1|1", rck3.numberOfPatternMatched("aa","aab"));
        assertEquals("4|1|2|7", rck3.numberOfPatternMatched("aa","aabaaopopoaaklklkaap|aab|aaaoaa"));

    }

//    @Test
//    public void findMultipleWordsInMultipleBlobs(){
//        assertEquals("0|0|0|0",blkRock3.numberOfPatternMatched("bcdejf","asdsd|asdab|bcdefaaaoaa"));
//        assertEquals("0|0|1|0|1",blkRock3.numberOfPatternMatched("bcde","asdsd|asdab|bcdpfabcdeoaa|bcdaews"));
//
//    }


    @Test
    public void whenPattern_bb_And_blob_bbbb_4_matches() {
        assertEquals("3|3", rck3.numberOfPatternMatched("bb","bbbb|"));

    }

    @Test
    public void whenPattern_bb_And_blob_bbbb_and_cabb_4_1_matches() {
        assertEquals("3|1|4", rck3.numberOfPatternMatched("bb","bbbb|cabb|"));

    }

    @Test
    public void whenPattern_fromTest_matches_1() {
        assertEquals("4|4|4|0|10", rck3.numberOfPatternMatched("aa","aaaakjlhaa|aaadsaaa|easaaad|sa"));

    }

}