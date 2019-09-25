package JP_Morgan;

import org.junit.Test;

import static org.junit.Assert.*;

public class JP_Morgan_3Test {

    @Test
    public void returnsTrueWhenGivenRightFormattedSingleBrackets(){
        //assertTrue(JP_Morgan_3.checkCharacters("()"));
        assertEquals("True",JP_Morgan_3.checkCharacters("()"));
    }


    @Test
    public void returnFalseWhenGivenWrongFormattedSingleBrackets() {
        assertEquals("False",JP_Morgan_3.checkCharacters("(}"));
    }

}