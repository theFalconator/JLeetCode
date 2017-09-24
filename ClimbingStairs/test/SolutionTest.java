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
    void BaseCases() {
        assertEquals(0, s.climbStairs(0));
        assertEquals(1, s.climbStairs(1));
        assertEquals(2, s.climbStairs(2));
    }

    @Test
    void ThreeStairs() {
        assertEquals(3, s.climbStairs(3));
    }

    @Test
    void nStairs() {
        assertEquals(5, s.climbStairs(4));
        assertEquals(8, s.climbStairs(5));
    }
}