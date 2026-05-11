package com.github.pushkar97;

import com.github.pushkar97.common.ListNode;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/merge-two-sorted-lists">merge-two-sorted-lists</a>
 *
 * @author pushkardesai
 */
public class P21 {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;
    if (list1.getVal() < list2.getVal()) {
      var temp = list1.getNext();
      list1.setNext(mergeTwoLists(temp, list2));
      return list1;
    } else {
      var temp = list2.getNext();
      list2.setNext(mergeTwoLists(temp, list1));
      return list2;
    }
  }
}
