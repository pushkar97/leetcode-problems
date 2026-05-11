package com.github.pushkar97;

import com.github.pushkar97.common.TreeNode;

/**
 * Problem: <a href="https://leetcode.com/problems/invert-binary-tree">invert-binary-tree</a>
 *
 * @author pushkardesai
 */
public class P226 {

  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      invertTree(root.getLeft());
      invertTree(root.getRight());

      TreeNode temp = root.getRight();
      root.setRight(root.getLeft());
      root.setLeft(temp);
    }
    return root;
  }
}
