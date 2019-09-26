package katas;

import org.junit.Test;
import static org.junit.Assert.*;

public class JadenCaseTest {

    @Test
    public void returnWithFirstAlphabetCapital(){
        assertEquals("Lmaaao",JadenCase.capitalAlpha("lmaaao"));
        assertEquals("Haha",JadenCase.capitalAlpha("haha"));
    }

    @Test
    public void test() {
        assertEquals("Most Trees Are Blue", JadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    public void testNullArg() {
        assertNull(JadenCase.toJadenCase(null));
    }

    @Test
    public void testEmptyArg() {
        assertNull(JadenCase.toJadenCase(""));
    }

}