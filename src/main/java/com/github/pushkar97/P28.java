package com.github.pushkar97;

/**
 * Problem: <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string">find-the-index-of-the-first-occurrence-in-a-string</a>
 *
 * @author pushkardesai
 */
public class P28 {

    public int strStr(String haystack, String needle) {
        byte[] bytes = haystack.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            int j = 0, k = i;
            while (k < bytes.length && j < needle.length() && bytes[k++] == needle.charAt(j++)) {
                if (j == needle.length()) return i;
            }
        }
        return -1;
    }
}
