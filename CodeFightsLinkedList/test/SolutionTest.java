import org.junit.Test;
import solution.ListNode;

import static org.junit.Assert.*;
import static solution.Solution.*;

public class SolutionTest {

    @Test
    public void singleElementShouldReturnTrue() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1})));
    }

    @Test
    public void twoOfTheSameShouldReturnTrue() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {0, 0})));
    }

    @Test
    public void listOfTwoDifferentElementsShouldReturnFalse() {
        assertFalse(isListPalindrome(buildFromIntArray(new int[] {1, 2})));
        assertFalse(isListPalindrome(buildFromIntArray(new int[] {3, 4})));
    }

    @Test
    public void listOfThreeShouldReturnTrueIfFirstEqualsLast() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1, 2, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {0, 100, 0})));
    }

    @Test
    public void listofThreeShouldReturnFalse() {
        assertFalse(isListPalindrome(buildFromIntArray(new int[] {1,2,3})));
    }

    @Test
    public void listOfNShouldBeTrueIfReverseIsSameAsOriginal() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1, 2, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1, 2, 1, 2, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1})));
    }

    @Test
    public void testBuildFromArray() {
        ListNode<Integer> l = buildFromIntArray(new int[] {0,1,0});
        assertEquals(0, (int)l.value);
        assertEquals(1, (int)l.next.value);
        assertEquals(0, (int)l.next.next.value);
    }

    @Test
    public void testToString() {
        ListNode<Integer> l = buildFromIntArray(new int[] {0,1,0});
        assertEquals("[0, 1, 0]", l.toString());
    }

    @Test
    public void testReverse() {
        ListNode<Integer> l = buildFromIntArray(new int[] {0,1,2,3,4});
    }

    @Test
    public void testCompare() {
        ListNode<Integer> a = buildFromIntArray(new int[] {0,1,2});
        ListNode<Integer> b = buildFromIntArray(new int[] {1,2,3});

        assertFalse(compareLists(a,b));

        ListNode<Integer> c = buildFromIntArray(new int[] {4,5,6});
        ListNode<Integer> d = c;

        assertTrue(compareLists(c,d));
    }
}