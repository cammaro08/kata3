package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class PIN_codeTest {


    @Test
    public void checkPinWithAlphabetsFails() {
        assertFalse(PIN_code.validatePin("abc123"));
    }

    @Test
    public void validPins() {
        assertTrue(PIN_code.validatePin("1234"));
        assertTrue(PIN_code.validatePin("0000"));
        assertTrue(PIN_code.validatePin("1111"));
        assertTrue(PIN_code.validatePin("123456"));
        assertTrue(PIN_code.validatePin("098765"));
        assertTrue(PIN_code.validatePin("000000"));
        assertTrue(PIN_code.validatePin("090909"));
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(PIN_code.validatePin("a234"));
        assertFalse(PIN_code.validatePin(".234"));
        assertFalse(PIN_code.validatePin("ab34"));
        assertFalse(PIN_code.validatePin("ab3y"));
        assertFalse(PIN_code.validatePin("12b3"));
    }

    @Test
    public void invalidLengths() {
        assertFalse(PIN_code.validatePin("1"));
        assertFalse(PIN_code.validatePin("12"));
        assertFalse(PIN_code.validatePin("123"));
        assertFalse(PIN_code.validatePin("12345"));
        assertFalse(PIN_code.validatePin("1234567"));
        assertFalse(PIN_code.validatePin("-1234"));
        assertFalse(PIN_code.validatePin("1.234"));
        assertFalse(PIN_code.validatePin("00000000"));
    }


}