package com.github.pushkar97;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;

/**
 * Problem: <a href="https://leetcode.com/problems/valid-parentheses">valid-parentheses</a>
 *
 * @author pushkardesai
 */
public class P20 {

  Map<Byte, Byte> correspondingBracket =
      Map.of((byte) ')', (byte) '(', (byte) '}', (byte) '{', (byte) ']', (byte) '[');

  public boolean isValid(String s) {
    byte[] bytes = s.getBytes();
    Deque<Byte> stack = new ArrayDeque<>();
    for (byte aByte : bytes) {
      if (!correspondingBracket.containsKey(aByte)) {
        stack.push(aByte);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        if (Objects.equals(stack.peek(), correspondingBracket.get(aByte))) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
