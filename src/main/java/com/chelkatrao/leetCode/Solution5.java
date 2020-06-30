package com.chelkatrao.leetCode;

public class Solution5 {

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(solution5.longestPalindrome("fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffgggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg"));

    }

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        StringBuilder finalResult = new StringBuilder("");
        for (int i = 0; i < chars.length; i++) {
            M:
            for (int j = chars.length - 1; j > 0; j--) {
                if (chars[i] == chars[j]) {
                    boolean checker = true;
                    int ii = i;
                    int jj = j;

                    while (checker) {
                        if (ii < chars.length - 1 && jj > 0) {
                            if (Math.abs((ii - jj)) != 1) {
                                jj = jj - 1;
                                ii = ii + 1;
                            } else {
                                checker = false;
                            }
                            if (chars[ii] == chars[jj]) {
                                if (ii == jj || ii + 1 == jj || ii == jj - 1) {
                                    StringBuilder result = new StringBuilder("");
                                    for (int k = i; k <= j; k++) {
                                        result.append(chars[k]);
                                    }
                                    if (finalResult.length() < result.length()) {
                                        finalResult = result;
                                    }
                                }
                            } else {
                                checker = false;
                            }
                        } else {
                            break M;
                        }
                    }
                }
            }
        }
        if (!finalResult.toString().isEmpty()) {
            return finalResult.toString();
        }
        if (s.length() > 0) {
            return String.valueOf(chars[0]);
        } else {
            return s;
        }
    }

}
