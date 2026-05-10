package com.github.pushkar97;

import java.util.Arrays;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/search-insert-position">search-insert-position</a>
 *
 * @author pushkardesai
 */
public class P35 {

  public int searchInsert(int[] nums, int target) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return target > nums[0] ? 1 : 0;
    }

    int mid = nums.length / 2;
    if (nums[mid] == target) {
      return mid;
    }
    if (nums[mid] > target) {
      return searchInsert(Arrays.copyOfRange(nums, 0, mid), target);
    }
    return mid + 1 + searchInsert(Arrays.copyOfRange(nums, mid + 1, nums.length), target);
  }
}
