package com.github.pushkar97;

import java.util.List;
import java.util.Objects;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/merge-two-sorted-lists">merge-two-sorted-lists</a>
 *
 * @author pushkardesai
 */
public class P21 {

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    public static ListNode fromList(List<Integer> list) {
      if (list == null || list.isEmpty()) {
        return null;
      }
      ListNode listNode = new ListNode(list.getLast());
      for (int i = list.size() - 2; i >= 0; i--) {
        listNode = new ListNode(list.get(i), listNode);
      }
      return listNode;
    }

    @Override
    public boolean equals(final Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      final ListNode listNode = (ListNode) o;
      return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, next);
    }

    @Override
    public String toString() {
      return val + (next != null ? String.format(", %s", next) : "");
    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    if (list1.val < list2.val) {
      var temp = list1.next;
      list1.next = mergeTwoLists(temp, list2);
      return list1;
    } else {
      var temp = list2.next;
      list2.next = mergeTwoLists(temp, list1);
      return list2;
    }
  }
}
