package addtwohugenumbers;

public class AddTwoHugeNumbers {
    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> result = new ListNode<>(0);
        ListNode<Integer> head = result;
        int carry = 0;
        a = reverse(a);
        b = reverse(b);
        while(a != null || b != null) {

        }
        return a;
    }

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
}
