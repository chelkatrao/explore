package com.chelkatrao.leetCode;

import java.util.ArrayList;

public class Solution10 {

    public static void main(String[] args) {

        Solution10 solution10 = new Solution10();

        System.out.println(solution10.isMatch("aa", "a"));                                              // false  - false ✓
        System.out.println(solution10.isMatch("aa", "a*"));                                             // true   -  true ✓
        System.out.println(solution10.isMatch("ab", ".*"));                                             // true   -  true ✓
        System.out.println(solution10.isMatch("aab", "c*a*b"));                                         // true   -  true ✓
        System.out.println(solution10.isMatch("mississippi", "mis*is*ip*."));                           // true   -  true ✓
        System.out.println(solution10.isMatch("aaa", ".a"));                                            // false  - false ✓
        System.out.println(solution10.isMatch("aaa", "ab*a"));                                          // false  - false ✓
        System.out.println(solution10.isMatch("aaa", "aaa"));                                           // true   -  true ✓
        System.out.println(solution10.isMatch("aaa", "a*a"));                                           // true   -  true ✓
        System.out.println(solution10.isMatch("ab", ".*c"));                                            // false  - false ✓
        System.out.println(solution10.isMatch("aaa", ".*"));                                            // true   -  true ✓
        System.out.println(solution10.isMatch("aaa", "ab*a*c*a"));                                      // true   -  true ✓
        System.out.println(solution10.isMatch("abbbbbb", "ab*a*c*"));                                   // false  -  true ✓
        System.out.println(solution10.isMatch("aaa", "ab*a"));                                          // false  - false ✓
        System.out.println(solution10.isMatch("a", ".*"));                                              // true   -  true ✓
        System.out.println(solution10.isMatch("aaa", "a.a"));                                           // true   -  true ✓
        System.out.println(solution10.isMatch("bc", ".*.."));                                           // true   -  true ✓
        System.out.println(solution10.isMatch("", "."));                                                // false  - false ✓
        System.out.println(solution10.isMatch("a", "a."));                                              // false  - false ✓
        System.out.println(solution10.isMatch("a", "ab*"));                                             // true   -  true ✓
        System.out.println(solution10.isMatch("", ""));                                                 // true   -  true ✓
        System.out.println(solution10.isMatch("aasdfasdfasdfasdfas", "aasdf.*asdf.*asdf.*asdf.*s"));    // true   -  true ✓
        System.out.println(solution10.isMatch("aasdfasdfasdfasdfas", "aasdfasdfasdfasdfas*"));          // true   -  true ✓
        System.out.println(solution10.isMatch("a", "ab*a*"));                                           // false  - false ✓
//
    }

    public boolean isMatch(String s, String p) {
        // pattern da '.' va '*' mavjud bo'lmasa va bir biriga teng bo'lmasa false qaytaradi
        boolean isPresent = p.contains(".") || p.contains("*");
        if (!isPresent && !p.equals(s)) return false;
        else if (p.equals(s)) return true;

        if (s.isEmpty() && !p.contains("*"))
            return false;

        ArrayList<Character> filteredString = toArrayList(s);
        char[] patter = p.toCharArray();

        // patternni loop da aylantirish

        for (int i = 0; i < patter.length; i++) {
            if (filteredString.size() == 0 && i < patter.length - 2 && patter[i] != '*') {
                return false;
            }
            {
                try {
                    if (patter[i - 2] != patter[i] && patter[i] != '*' && filteredString.size() == 0) {
                        if (i + 1 <= patter.length) {
                            try {
                                if (patter[i + 1] != '*') {
                                    return false;
                                }
                            } catch (Exception e) {
                            }
                        }
                    }
                } catch (Exception e) {
                    boolean a = true;
                    if (i + 1 < patter.length && patter[i + 1] == '*' && filteredString.size() == 0)
                        a = false;
                    if (a && patter[i] != '*' && filteredString.size() == 0) {
                        return false;
                    }
                }

                if (i + 1 < patter.length && patter[i + 1] == '*') {
                    int size = filteredString.size();
                    int patterCharCount = 0;
                    for (int k = i + 1; k < patter.length; k++) {
                        if (patter[k] == patter[i]) {
                            patterCharCount++;
                        }
                    }
                    for (int j = 0; j < size; j++) {
                        if (filteredString.size() > 0 && filteredString.get(0) == patter[i]) {
                            if (patterCharCount == 0) {
                                filteredString.remove(0);
                            }
                            if (patterCharCount > 0)
                                patterCharCount--;
                        }
                    }
                }

                if (filteredString.size() > 0 && patter[i] == '.') {
                    if (!(i + 2 < patter.length && patter[i + 1] == '*' && patter[i + 2] == '.'))
                        filteredString.remove(0);
                }

                if (filteredString.size() > 0 && i - 1 >= 0 && patter[i - 1] == '.' && patter[i] == '*') {
                    char compiler = filteredString.get(0);
                    int size = filteredString.size();
                    for (int j1 = 0; j1 < size; j1++) {
                        if (compiler == filteredString.get(0)) {
                            if (!(i + 1 < patter.length && patter[i + 1] != '.'))
                                filteredString.remove(0);
                        } else break;
                    }
                }

                if (i + 1 < patter.length && patter[i + 1] != '*' && patter[i] != '*') {
                    if (filteredString.size() > 0 && filteredString.get(0) == patter[i]) {
                        filteredString.remove(0);
                    }
                }

                if (patter.length - 1 == i) {
                    if (filteredString.size() > 0 && filteredString.get(0) == patter[i]) {
                        filteredString.remove(0);
                    }
                }

            }
        }

        return filteredString.isEmpty();
    }

    public ArrayList<Character> toArrayList(String str) {
        ArrayList<Character> charArrays = new ArrayList<>();
        for (char c : str.toCharArray()) {
            charArrays.add(c);
        }
        return charArrays;
    }
}