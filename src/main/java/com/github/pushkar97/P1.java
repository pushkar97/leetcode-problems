package com.github.pushkar97;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: <a href="https://leetcode.com/problems/two-sum">two-sum</a>
 *
 * @author pushkardesai
 */
public class P1 {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> t = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      if (t.containsKey(target - nums[i])) {
        return new int[] {t.get(target - nums[i]), i};
      } else {
        t.put(nums[i], i);
      }
    }
    return new int[] {};
  }
}
