import org.junit.Test;

import static org.junit.Assert.*;
import static daily347.Daily347.*;

public class Daily347Test {

    @Test
    public void SampleInput() {
        String[] input = new String[]{"1 3", "2 3", "4 5"};

        assertEquals("The lights should be on for three hours.", 3, getLights(input));

    }

    @Test
    public void SampleInput2() {
        String[] input = new String[]{"2 4", "3 6", "1 3", "6 8"};

        assertEquals(7, getLights(input));

    }

    @Test
    public void SampleInput3() {
        String[] input = new String[]{"6 8", "5 8", "8 9", "5 7", "4 7"};

        assertEquals(5, getLights(input));

    }
}