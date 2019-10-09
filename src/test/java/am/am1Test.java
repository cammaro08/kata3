package am;

import org.junit.Test;

import static org.junit.Assert.*;

public class am1Test {

    @Test
    public void  testaaa(){
        assertEquals(1,am1.solution5("aaa"));
    }


    @Test
    public void  testbaabab(){
        assertEquals(0,am1.solution5("baabab"));
    }


    @Test
    public void  testbaaaaa(){
        assertEquals(1,am1.solution5("baaaaa"));
    }


    @Test
    public void  testbaaabbaabbba(){
        assertEquals(2,am1.solution5("baaabbaabbba"));
    }

    @Test
    public void  lolz(){
        assertEquals(2,am1.solution5("aaabbb"));
    }


}