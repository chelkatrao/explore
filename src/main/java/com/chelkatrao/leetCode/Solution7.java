package com.chelkatrao.leetCode;

public class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.reverse(1563847412));
    }

    public int reverse(int x) {
        int y = x;
        int count = 0;

        while (true) {
            if (x == 0) {
                break;
            }
            x = x / 10;
            count++;
        }

        long result = 0;

        while (count > 0) {
            int a = y % 10;
            long num = a * (long) Math.pow(10, count - 1);
            result += num;
            y = y / 10;
            count--;
        }
        if (result < -Math.pow(2, 31) || result > Math.pow(2, 31) - 1) {
            return 0;
        }
        return (int) result;
    }
}
