package com.chelkatrao.leetCode;

public class Solution9 {

    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.isPalindrome(2147483647));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false; if (x == 0) return true;
        String reversed = "";
        long s, result = x;
        while (x > 0) {
            s = x % 10;
            x = x / 10;
            reversed += s;
        }
        return Long.valueOf(reversed).equals(result);
    }

}
