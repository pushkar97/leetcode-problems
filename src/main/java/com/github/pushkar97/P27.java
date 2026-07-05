package com.github.pushkar97;

/**
 * Problem: <a href="https://leetcode.com/problems/remove-element">remove-element</a>
 *
 * @author pushkardesai
 */
public class P27 {

  public int removeElement(int[] nums, int val) {
    int j = nums.length - 1;
    while (j >= 0 && nums[j] == val) {
      j--;
    }
    int i = 0;
    while (i <= j) {
      if (nums[i] == val) {
        nums[i] = nums[j];
        nums[j] = val;
        do {
          j--;
        } while (j >= 0 && nums[j] == val);
      }
      i++;
    }
    return i;
  }
}
