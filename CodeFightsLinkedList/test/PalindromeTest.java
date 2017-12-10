import org.junit.Test;
import solution.ListNode;

import static org.junit.Assert.*;
import static solution.Palindrome.*;

public class PalindromeTest {

    @Test
    public void singleElement() {
        assertTrue("Any single element should return true", isListPalindrome(buildFromIntArray(new int[]{1})));
    }

    @Test
    public void listOfTwo() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[]{1, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[]{0, 0})));
        assertFalse(isListPalindrome(buildFromIntArray(new int[]{1, 2})));
        assertFalse(isListPalindrome(buildFromIntArray(new int[]{3, 4})));
    }

    @Test
    public void listOfThree() {

        assertTrue("First element same as last should return true.", isListPalindrome(buildFromIntArray(new int[]{1, 2, 1})));
        assertTrue(isListPalindrome(buildFromIntArray(new int[] {3,3,3})));
        assertFalse("Should return false when first != last", isListPalindrome(buildFromIntArray(new int[]{1, 2, 3})));
    }

    @Test
    public void nElementsPalindrome() {
        assertTrue(isListPalindrome(buildFromIntArray(new int[]{1, 2, 1})));
//        assertTrue(isListPalindrome(buildFromIntArray(new int[]{1, 2, 1, 2, 1})));
//        assertTrue(isListPalindrome(buildFromIntArray(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1})));
//
//        assertTrue(isListPalindrome(buildFromIntArray(new int[]{1, 1000000000, -1000000000, -1000000000, 1000000000, 1})));
//        assertFalse(isListPalindrome(buildFromIntArray(new int[]{1, 2, 3, 4, 5})));
    }

    @Test
    public void testBuildFromArray() {
        ListNode<Integer> l = buildFromIntArray(new int[]{0, 1, 0});
        assertEquals(0, (int) l.value);
        assertEquals(1, (int) l.next.value);
        assertEquals(0, (int) l.next.next.value);
    }

    @Test
    public void testToString() {
        ListNode<Integer> l = buildFromIntArray(new int[]{0, 1, 0});
        assertEquals("[0, 1, 0]", l.toString());
    }

    @Test
    public void testReverse() {
        ListNode<Integer> l = buildFromIntArray(new int[]{0, 1, 2, 3, 4});
    }

    @Test
    public void testCompare() {
        ListNode<Integer> a = buildFromIntArray(new int[]{1, 2, 1});
        ListNode<Integer> b = buildFromIntArray(new int[]{1, 2});

        assertFalse("Offset by one should return false", compareLists(a, b));
        assertTrue(compareLists(buildFromIntArray(new int[] {1,2,3,4,5}),
                buildFromIntArray(new int[] {1,2,3,4,5})));
    }
}