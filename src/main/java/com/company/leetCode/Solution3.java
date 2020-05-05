package com.company.leetCode;

public class Solution3 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();

        System.out.println(solution3.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution3.lengthOfLongestSubstring("bbbbbbb"));
        System.out.println(solution3.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        String strCombiner;
        String strCombinerTemporary = "";

        for (int i = 0; i < c.length; i++) {
            strCombiner = "";
            M:
            for (int j = i; j < c.length; j++) {
                if (strCombiner.contains(Character.toString(c[j])) == false) {
                    strCombiner += c[j];
                } else {
                    break M;
                }
            }
            if (strCombiner.length() > strCombinerTemporary.length())
                strCombinerTemporary = strCombiner;
        }
        return strCombinerTemporary.length();
    }
}
