package com.github.pushkar97;

/**
 * Problem: <a href="https://leetcode.com/problems/valid-palindrome">valid-palindrome</a>
 *
 * @author pushkardesai
 */
public class P125 {

  public boolean isPalindrome(String s) {
    if (s == null || s.isEmpty()) return true;
    byte[] bytes = s.toLowerCase().getBytes();
    int start = 0;
    int end = bytes.length - 1;
    while (start < end) {
      while (start < s.length() && !Character.isLetterOrDigit(bytes[start])) start++;
      if (start >= s.length()) {
        return true;
      }
      while (end >= 0 && !Character.isLetterOrDigit(bytes[end])) end--;
      if (end < 0 || bytes[start++] != bytes[end--]) {
        return false;
      }
    }
    return true;
  }
}
