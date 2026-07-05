package com.github.pushkar97;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">longest-substring-without-repeating-characters</a>
 *
 * @author pushkardesai
 */
public class P3 {

  public int lengthOfLongestSubstring(String s) {
    int i = -1;
    int j = 0;
    int max = 0;

    Map<Character, Integer> visited = new HashMap<>();
    for (; j < s.length(); j++) {
      var val = visited.put(s.charAt(j), j);
      if (val != null && val > i) {
        i = val;
      }
      max = Math.max(max, j - i);
    }
    return max;
  }
}
