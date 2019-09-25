package Black_Rock;

import Black_Rock.BLK_Rock;
import org.junit.Test;

import static org.junit.Assert.*;

public class BLK_RockTest {


    @Test
    public void returnFiftyNoteWhenPurchase100(){
        assertEquals("Fifty Pounds", BLK_Rock.calculateChange(50,100));
    }

    @Test
    public void returnFiftyAndFiftyNoteWhenPurchase200(){
        assertEquals("Fifty Pounds, Fifty Pounds",BLK_Rock.calculateChange(50,150));
    }

    @Test
    public void returnFiftyandTwentyNoteWhenPurchase(){
        assertEquals("Fifty Pounds, Twenty Pounds",BLK_Rock.calculateChange(230,300));
    }

    @Test
    public void returnTwentyandTwentyNoteWhenPurchase() {
        assertEquals("Twenty Pounds, Twenty Pounds", BLK_Rock.calculateChange(60, 100));
    }

    @Test
    public void returnFiftyandTwentyAndTenNoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds", BLK_Rock.calculateChange(20, 100));
    }

    @Test
    public void return_50_20_10_5_NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds", BLK_Rock.calculateChange(15, 100));
    }

    @Test
    public void return_50_20_10_5_2_NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds, Two Pounds", BLK_Rock.calculateChange(13, 100));
    }

    @Test
    public void return_50_20_10_5_2_1NoteWhenPurchase() {
        assertEquals("Fifty Pounds, Twenty Pounds, Ten Pounds, Five Pounds, Two Pounds, One Pound", BLK_Rock.calculateChange(12, 100));
    }

    @Test
    public void return_50_ZeroFive_WhenPurchase() {
        assertEquals("Fifty Pounds, Fifty Pence", BLK_Rock.calculateChange(50.5, 100));
    }

}