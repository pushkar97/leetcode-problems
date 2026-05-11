package com.github.pushkar97.common;

import java.util.List;
import java.util.Objects;

public class ListNode {
  int val;
  ListNode next;

  public int getVal() {
    return val;
  }

  public void setVal(final int val) {
    this.val = val;
  }

  public ListNode getNext() {
    return next;
  }

  public void setNext(final ListNode next) {
    this.next = next;
  }

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
