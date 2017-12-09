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

    public static boolean isListPalindrome(ListNode<Integer> l) {
        String original = l.toString();
        String reversed = reverse(l).toString();
        return original.equals(reversed);
    }
}
