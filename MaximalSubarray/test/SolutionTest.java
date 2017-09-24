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
    void BaseCaseEmptyArray() {
        int[] input = {};
        assertEquals(0, s.maxSubArray(input));
    }

    @Test
    void BaseCaseSingleElement() {
        int[] input = {5};
        assertEquals(5, s.maxSubArray(input));
    }
}