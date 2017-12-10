package solution;

public final class Solution {

    public static ListNode<Integer> buildFromIntArray(int[] arr) {
        ListNode<Integer> head = new ListNode<>(arr[0]);
        ListNode<Integer> cursor = head;
        for(int i = 1; i < arr.length; i++) {
            cursor.next = new ListNode<>(arr[i]);
            cursor = cursor.next;
        }
        return head;
    }

    public static ListNode<Integer> reverse(ListNode<Integer> head) {
        ListNode<Integer> prev = null;
        ListNode<Integer> cursor = head;
        ListNode<Integer> nextNode = null;

        while(cursor != null) {
            nextNode = cursor.next;
            cursor.next = prev;
            prev = cursor;
            cursor = nextNode;
        }
        head = prev;
        return head;
    }

    public static boolean compareLists(ListNode<Integer> a, ListNode<Integer> b) {
        while(a != null && b != null) {
            if(a.value.equals(b.value)) {
                a = a.next;
                b = b.next;
            }
            else { return false; }
        }

        return a == null && b == null;
    }

    public static boolean isListPalindrome(ListNode<Integer> head) {
        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;
        ListNode<Integer> slowPrev = null;


        if(head != null && head.next!=null) {
            while(fast.next != null) {
                fast = fast.next;
                slowPrev = slow;
                slow = slow.next;
            }
        }

        ListNode<Integer> mid = null;
        if(fast != null) {
            mid = slow;
            slow=slow.next;
        }

        ListNode<Integer> secondHalf = slow;
        slowPrev.next = null;

        return false;
    }
}
