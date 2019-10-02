package blackrock;

import org.junit.Test;

import static org.junit.Assert.*;

public class blkRock3Test {

    @Test
    public void findSingleWordInSingleBlob(){
        assertEquals("1|1",blkRock3.numberOfPatternMatched("a","ab"));
        assertEquals("2|2",blkRock3.numberOfPatternMatched("a","aba"));
        assertEquals("4|4",blkRock3.numberOfPatternMatched("a","abaopopoaklklkap"));
    }

    @Test
    public void lolz(){
        assertEquals("4|1|2|7",blkRock3.numberOfPatternMatched("aa","aabaaopopoaaklklkaap|aab|aaaoaa"));
    }


    @Test
    public void findSingleWordInMultipleBlobs(){
        assertEquals("1|1|2",blkRock3.numberOfPatternMatched("a","ab|ab"));
        assertEquals("4|1|2|7",blkRock3.numberOfPatternMatched("a","abaopopoaklklkap|ab|aao"));

    }


    @Test
    public void findTwoWordsInMultipleBlobs(){
        assertEquals("1|1",blkRock3.numberOfPatternMatched("aa","aab"));
        assertEquals("4|1|2|7",blkRock3.numberOfPatternMatched("aa","aabaaopopoaaklklkaap|aab|aaaoaa"));
    }


}