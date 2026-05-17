package com.github.pushkar97;

import com.github.pushkar97.common.ListNode;
import java.util.HashSet;

/**
 * Problem: <a href="https://leetcode.com/problems/linked-list-cycle">linked-list-cycle</a>
 *
 * @author pushkardesai
 */
public class P141 {

  public boolean hasCycle(ListNode head) {
    ListNode curr = head;
    var visited = new HashSet<ListNode>();
    while (curr != null) {
      if (visited.contains(curr)) {
        return true;
      }
      visited.add(curr);
      curr = curr.getNext();
    }
    return false;
  }
}
