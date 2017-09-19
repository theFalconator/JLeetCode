import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void sampleInput() {
        int[] input = new int[] {1,1,2};
        Solution s = new Solution();
        assertEquals(2, s.removeDuplicates(input));
    }

    @Test
    void EmptyInput() {
        int[] input = new int[] {};
        Solution s = new Solution();
        assertEquals(0, s.removeDuplicates(input));
    }

    @Test
    void LongerInput() {
        int[] input = {1,1,2,3,4,4,5};
        Solution s = new Solution();
        assertEquals(5, s.removeDuplicates(input));
    }

    @Test
    void RepeatedNumber() {
        int[] input = {1,1,1};
        Solution s = new Solution();
        assertEquals(1, s.removeDuplicates(input));
    }
}