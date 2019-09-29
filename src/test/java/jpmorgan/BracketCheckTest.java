package jpmorgan;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketCheckTest {


    @Test
    public void checkIfSingleBracketsWork() {
        assertEquals("True",BracketCheck.checkBracket("()()"));
    }

}