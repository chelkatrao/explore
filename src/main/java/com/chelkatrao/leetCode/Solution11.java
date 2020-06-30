package com.chelkatrao.leetCode;

public class Solution11 {

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.maxArea(array));
    }

    public int maxArea(int[] array) {
        int maxWatter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    int capacity;
                    if (array[i] <= array[j]) {
                        capacity = array[i] * Math.abs(i - j);
                    } else {
                        capacity = array[j] * Math.abs(i - j);
                    }
                    if (capacity > maxWatter) {
                        maxWatter = capacity;
                    }
                }
            }
        }
        return maxWatter;
    }
}
