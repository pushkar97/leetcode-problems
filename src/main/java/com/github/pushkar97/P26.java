package com.github.pushkar97;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/remove-duplicates-from-sorted-array">remove-duplicates-from-sorted-array</a>
 *
 * @author pushkardesai
 */
public class P26 {

  public int removeDuplicates(int[] nums) {
    int size = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[size++] = nums[i];
      }
    }
    return size;
  }
}
