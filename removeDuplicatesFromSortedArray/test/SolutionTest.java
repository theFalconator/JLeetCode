import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution s;

    @BeforeEach
    void setUp() {
        s = new Solution();
    }

    @Test
    void sampleInput() {
        int[] input = new int[] {1,1,2};

        assertEquals(2, s.removeDuplicates(input));
    }

    @Test
    void EmptyInput() {
        int[] input = new int[] {};

        assertEquals(0, s.removeDuplicates(input));
    }

    @Test
    void LongerInput() {
        int[] input = {1,1,2,3,4,4,5};

        assertEquals(5, s.removeDuplicates(input));
    }

    @Test
    void RepeatedNumber() {
        int[] input = {1,1,1};

        assertEquals(1, s.removeDuplicates(input));
    }
}