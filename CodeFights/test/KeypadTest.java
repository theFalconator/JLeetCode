import oldmobilephone.Keypad;
import org.junit.Test;

import static org.junit.Assert.*;
import static oldmobilephone.Keypad.*;
public class KeypadTest {

    @Test
    public void singlePress() {
        assertEquals(1, presses("A"));
        assertEquals(1, presses("D"));
        assertEquals(1, presses("G"));
        assertEquals(1, presses("J"));
        assertEquals(1, presses("M"));
        assertEquals(1, presses("P"));
        assertEquals(1, presses("T"));
        assertEquals(1, presses("W"));
        assertEquals(1, presses(" "));
    }

    @Test
    public void twoPresses() {
        assertEquals(2, presses("B"));
        assertEquals(2, presses("E"));
        assertEquals(2, presses("H"));
        assertEquals(2, presses("K"));
        assertEquals(2, presses("N"));
        assertEquals(2, presses("Q"));
        assertEquals(2, presses("U"));
        assertEquals(2, presses("X"));
    }

    @Test
    public void threePresses() {
        assertEquals(3, presses("C"));
        assertEquals(3, presses("F"));
        assertEquals(3, presses("I"));
        assertEquals(3, presses("L"));
        assertEquals(3, presses("O"));
        assertEquals(3, presses("R"));
        assertEquals(3, presses("V"));
        assertEquals(3, presses("Y"));
    }

    @Test
    public void fourPresses() {
        assertEquals(4, presses("S"));
        assertEquals(4, presses("Z"));
    }

    @Test
    public void singleWords() {
        assertEquals(9, presses("LOL"));
    }

    @Test
    public void shortSentence() {
        assertEquals(13, presses("HOW R U"));
    }
}