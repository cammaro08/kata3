package blackrock;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class blk_Rock_2Test {


    @Test
    public void returnOneReversedWord() {
        String input = "hip";
        List<Character> letters = new ArrayList<Character>();
        letters.add('h');
        letters.add('i');
        letters.add('p');
        assertEquals("p-i-h", blkRock2.reverseString("hip"));
    }

    @Test
    public void returnTwoReverseWords() {
        String input = "hip";
        List<Character> letters = new ArrayList<Character>();
        letters.add('h');
        letters.add('i');
        letters.add('p');
        letters.add(' ');
        letters.add('h');
        letters.add('i');
        letters.add('p');
        assertEquals("p-i-h-p-i-h", blkRock2.reverseString("hip hip"));
    }

    @Test
    public void andNowThis() {
        assertEquals("s-i-h-t-w-o-n-d-n-a", blkRock2.reverseString("And now           this:"));

    }

}