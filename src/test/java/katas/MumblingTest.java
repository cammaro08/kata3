package katas;

import static org.junit.Assert.*;

import org.junit.Test;


public class MumblingTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void testOneLetter() {
        System.out.println("Fixed Tests accum");
        testing(Mumbling.accum("Z"), "Z");
        testing(Mumbling.accum("z"), "Z");
    }


    @Test
    public void testTwoLetters(){
        testing(Mumbling.accum("Zp"), "Z-Pp");
        testing(Mumbling.accum("zp"), "Z-Pp");

    }

    @Test
    public void testThreeLetters(){
        testing(Mumbling.accum("Zpq"), "Z-Pp-Qqq");
        testing(Mumbling.accum("zpq"), "Z-Pp-Qqq");

    }

    @Test
    public void testCodeWars(){
        testing(katas.Mumbling.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(katas.Mumbling.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(katas.Mumbling.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(katas.Mumbling.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(katas.Mumbling.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }

}