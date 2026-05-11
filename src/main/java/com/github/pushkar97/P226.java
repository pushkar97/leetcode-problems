package com.github.pushkar97;

import java.util.List;
import java.util.Objects;

/**
 * Problem: <a href="https://leetcode.com/problems/invert-binary-tree">invert-binary-tree</a>
 *
 * @author pushkardesai
 */
public class P226 {

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }

    public static TreeNode fromList(List<Integer> list) {
      if (list == null || list.isEmpty()) return null;
      return populate(list, 0);
    }

    @Override
    public boolean equals(final Object o) {
      if (o == null || getClass() != o.getClass()) return false;
      final TreeNode treeNode = (TreeNode) o;
      return val == treeNode.val
          && Objects.equals(left, treeNode.left)
          && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, left, right);
    }

    @Override
    public String toString() {
      return "[" + getString() + "]";
    }

    private String getString() {
      return val
          + (left == null && right == null
              ? ""
              : (left != null ? ", " + left.getString() : ", *")
                  + (right != null ? ", " + right.getString() : ", *"));
    }

    private static TreeNode populate(List<Integer> list, int index) {
      if (index >= list.size()) return null;
      if (list.get(index) == Integer.MIN_VALUE) return null;

      return new TreeNode(
          list.get(index), populate(list, index * 2 + 1), populate(list, index * 2 + 2));
    }
  }

  public TreeNode invertTree(TreeNode root) {
    if (root != null) {
      invertTree(root.left);
      invertTree(root.right);

      TreeNode temp = root.right;
      root.right = root.left;
      root.left = temp;
    }
    return root;
  }
}
