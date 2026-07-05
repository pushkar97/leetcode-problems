package com.github.pushkar97;

/**
 * Problem: <a href="https://leetcode.com/problems/01-matrix">01-matrix</a>
 *
 * @author pushkardesai
 */
public class P542 {

  public int[][] updateMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] != 0) {
          if (i > 0 && j > 0) {
            mat[i][j] = Math.min(mat[i - 1][j], mat[i][j - 1]) + 1;
          }
        }
      }
    }
    return mat;
  }
}
