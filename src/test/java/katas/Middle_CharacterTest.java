package katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class Middle_CharacterTest {

    @Test
    public void evenTests() {
        assertEquals("es", Middle_Character.getMiddle("test"));
        assertEquals("dd", Middle_Character.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Middle_Character.getMiddle("testing"));
        assertEquals("A", Middle_Character.getMiddle("A"));
    }
}

