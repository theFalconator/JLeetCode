package solution;

public final class Solution {

    public static ListNode<Integer> buildFromIntArray(int[] arr) {
        ListNode<Integer> head = new ListNode<>(arr[0]);
        ListNode<Integer> cursor = head;
        for (int i = 1; i < arr.length; i++) {
            cursor.next = new ListNode<>(arr[i]);
            cursor = cursor.next;
        }
        return head;
    }

    public static ListNode<Integer> reverse(ListNode<Integer> head) {
        ListNode<Integer> prev = null;
        ListNode<Integer> cursor = head;
        ListNode<Integer> nextNode = null;

        while (cursor != null) {
            nextNode = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = nextNode;
        }
        head = prev;
        return head;
    }

    public static boolean compareLists(ListNode<Integer> a, ListNode<Integer> b) {
        while(a != null) {
            if(a.value != b.value)
                return false;
            a = a.next;
            if(b.next == null)
                return false;
            b = b.next;
        }
        return true;
    }

    public static boolean isListPalindrome(ListNode<Integer> head) {
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;
        ListNode<Integer> slowPrev = null;

        // Edge case where there is only one element in the list
        if (head.next == null) {
            return true;
        }

        // Find the middle of the list by walking the two pointers
        if (head != null && head.next != null) {
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slowPrev = slow;
                slow = slow.next;
            }
        }

       //  only two elements in list
        if(fast == null && slow != null && slow.next == null) {
            return slow.value == head.value;
        }

        /*
        Even amount of elements in list will have:
            fast pointer pointing to null after walking
            slow pointer != null
        Odd amount of elements in list will have:
            fast pointer at last element in list
            slow pointer != null and slow pointer at mid
         */

        //
        System.out.println("Head: " + head);
        System.out.println("Slow: " + slow);

        return compareLists(reverse(slow), head);
    }
}
