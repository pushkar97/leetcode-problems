package com.github.pushkar97;

import com.github.pushkar97.common.TreeNode;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree">lowest-common-ancestor-of-a-binary-search-tree</a>
 *
 * @author pushkardesai
 */
public class P235 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) return null;
    if (root.getVal() > p.getVal() && root.getVal() > q.getVal()) {
      return lowestCommonAncestor(root.getLeft(), p, q);
    }
    if (root.getVal() < p.getVal() && root.getVal() < q.getVal()) {
      return lowestCommonAncestor(root.getRight(), p, q);
    }
    return root;
  }
}
