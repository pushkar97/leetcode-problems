package com.github.pushkar97;

import com.github.pushkar97.common.TreeNode;

/**
 * Problem: <a href="https://leetcode.com/problems/balanced-binary-tree">balanced-binary-tree</a>
 *
 * @author pushkardesai
 */
public class P110 {

  public boolean isBalanced(TreeNode root) {
    return isHeightBalanced(root).isBalanced();
  }

  private record Tuple(boolean isBalanced, int height) {}

  private Tuple isHeightBalanced(TreeNode root) {
    if (root == null) return new Tuple(true, 0);
    Tuple a = isHeightBalanced(root.getLeft());
    Tuple b = isHeightBalanced(root.getRight());
    int height = Math.max(a.height(), b.height()) + 1;
    if (a.isBalanced() && b.isBalanced() && Math.abs(a.height() - b.height()) <= 1) {
      return new Tuple(true, height);
    }
    return new Tuple(false, height);
  }
}
