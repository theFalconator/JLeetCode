package palindrome;

import java.util.Objects;

public class ListNode<T> {
  public ListNode(T x) {
    value = x;
  }
  public T value;
  public ListNode<T> next;

  @Override
  public String toString() {
      String result = "[";
      result += value;
      ListNode<T> cursor = this;
      while(cursor.next != null) {
          cursor = cursor.next;
          result += ", ";
          result += cursor.value;
      }
      result += "]";
      return result;
  }

}
