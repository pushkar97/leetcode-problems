package com.github.pushkar97;

import com.github.pushkar97.common.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem: <a
 * href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree">lowest-common-ancestor-of-a-binary-search-tree</a>
 *
 * @author pushkardesai
 */
public class P235 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    ArrayDeque<TreeNode> path1 = new ArrayDeque<>();
    ArrayDeque<TreeNode> path2 = new ArrayDeque<>();
    findPath(root, p, path1);
    findPath(root, q, path2);
    TreeNode result = null;
    while (!path1.isEmpty() && !path2.isEmpty()) {
      TreeNode treeNode = path1.removeLast();
      TreeNode treeNode1 = path2.removeLast();
      if (treeNode.getVal() == treeNode1.getVal()) {
        result = treeNode;
      }
    }
    return result;
  }

  private boolean findPath(TreeNode root, TreeNode p, Deque<TreeNode> path) {
    if (root == null) return false;
    path.push(root);
    if (root.getVal() == p.getVal()) return true;
    if (findPath(root.getLeft(), p, path)) {
      return true;
    }
    if (findPath(root.getRight(), p, path)) {
      return true;
    }
    path.pop();
    return false;
  }
}
