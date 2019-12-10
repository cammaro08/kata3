package m;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class m3 {

    @Test
    public void returnsTrueWhenGivenRightFormattedSingleBrackets(){
        //assertTrue(m3.checkCharacters("()"));
        Assert.assertEquals("True", m3.checkCharacters("()"));
    }


    @Test
    public void returnFalseWhenGivenWrongFormattedSingleBrackets() {
        Assert.assertEquals("False", m3.checkCharacters("(}"));
    }

}