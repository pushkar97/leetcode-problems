package com.github.pushkar97;

import java.util.Arrays;

/**
 * Problem: <a href="https://leetcode.com/problems/longest-common-prefix">longest-common-prefix</a>
 *
 * @author pushkardesai
 */
public class P14 {

  public String longestCommonPrefix(String[] strs) {
    byte[] prefix = strs[0].getBytes();
    for (int i = 1; i < strs.length; i++) {
      byte[] bytes = strs[i].getBytes();
      for (int j = 0; j < prefix.length; j++) {
        if (j == bytes.length || bytes[j] != prefix[j]) {
          prefix = Arrays.copyOfRange(prefix, 0, j);
        }
      }
    }
    return new String(prefix);
  }
}
