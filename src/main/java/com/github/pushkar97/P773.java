package com.github.pushkar97;

/**
 * Problem: <a href="https://leetcode.com/problems/flood-fill">flood-fill</a>
 *
 * @author pushkardesai
 */
public class P773 {

  public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int origCol = image[sr][sc];
    if(origCol == color) return image;
    image[sr][sc] = color;
    if (sr > 0 && image[sr - 1][sc] == origCol) floodFill(image, sr - 1, sc, color);
    if (sr < image.length - 1 && image[sr + 1][sc] == origCol) floodFill(image, sr + 1, sc, color);
    if (sc < image[sr].length - 1 && image[sr][sc + 1] == origCol)
      floodFill(image, sr, sc + 1, color);
    if (sc > 0 && image[sr][sc - 1] == origCol) floodFill(image, sr, sc - 1, color);
    return image;
  }
}
