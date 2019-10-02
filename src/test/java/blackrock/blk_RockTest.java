package blackrock;

import org.junit.Test;

import static org.junit.Assert.*;

public class blk_RockTest {


    @Test
    public void returnFiftyNoteWhenPurchase100(){
        assertEquals("Fifty Pounds", blkRock.calculateChange(50,100));
    }

    @Test
    public void returnFiftyAndFiftyNoteWhenPurchase200(){
        assertEquals("Fifty Pounds, Fifty Pounds", blkRock.calculateChange(50,150));
    }

    @Test
    public void returnFiftyandTwentyNoteWhenPurchase(){
        assertEquals("Fifty Pounds, Twenty Pounds", blkRock.calculateChange(230,300));
    }

    @Test
    public void returnTwentyandTwentyNoteWhenPurchase() {
        assertEquals("Twenty Pounds, Twenty Pounds", blkRock.calculateChange(60, 100));
    }

    @Test
    public void returnFiftyandTwentyAndTenNoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds", blkRock.calculateChange(20, 100));
    }

    @Test
    public void return_50_20_10_5_NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds", blkRock.calculateChange(15, 100));
    }

    @Test
    public void return_50_20_10_5_2_NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds, Two Pounds", blkRock.calculateChange(13, 100));
    }

    @Test
    public void return_50_20_10_5_2_1NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds, Two Pounds, One Pound", blkRock.calculateChange(12, 100));
    }

    @Test
    public void return_50_ZeroFifty_WhenPurchase() {
        assertEquals("Fifty Pounds, Fifty Pence", blkRock.calculateChange(49.5, 100));
    }

    @Test
    public void return_50_ZeroFifty_ZeroTwenty_WhenPurchase() {
        assertEquals("Fifty Pounds, Fifty Pence, Twenty Pence", blkRock.calculateChange(49.3, 100));
    }

    @Test
    public void return_ZeroTen_ZeroFive_WhenPurchase() {
        assertEquals("Ten Pence, Five Pence", blkRock.calculateChange(0.85, 1));
    }

    @Test
    public void return_ZeroTen_ZeroTwo_WhenPurchase() {
        assertEquals("Ten Pence, Two Pence", blkRock.calculateChange(0.88, 1));
    }
}