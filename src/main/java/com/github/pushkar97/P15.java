package com.github.pushkar97;

import java.util.*;

/**
 * Problem: <a href="https://leetcode.com/problems/two-sum">two-sum</a>
 *
 * @author pushkardesai
 */
public class P15 {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Set<Integer> visited = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      var target = -nums[i];
      var map = new HashMap<Integer, Integer>(nums.length);
      for (int j = i + 1; j < nums.length; j++) {
        if (map.containsKey(target - nums[j])) {
          var k = map.get(target - nums[j]);
          if (visited.contains(-nums[k])) {
            res.add(List.of(nums[i], nums[k], nums[j]));
          }

        } else {
          map.put(nums[j], j);
        }
      }
      visited.add(target);
    }
    return res;
  }
}
