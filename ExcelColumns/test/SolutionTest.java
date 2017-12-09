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
    void TestSingleColumns() {
        assertEquals("A", s.convertToTitle(1));
    }

}