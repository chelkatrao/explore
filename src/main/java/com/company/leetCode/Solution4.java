package com.company.leetCode;

public class Solution4 {
    public static void main(String[] args) {

        Solution4 solution4 = new Solution4();

        int[] nums1 = new int[0];
        int[] nums2 = new int[1];
//        nums1[0] = 1;
//        nums1[1] = 2;

        nums2[0] = 1;
//        nums2[1] = 4;

        System.out.println(solution4.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double length1 = nums1.length;
        double length2 = nums2.length;

        double sum1 = 0.0;
        for (int i : nums1)
            sum1 += i;

        double sum2 = 0.0;
        for (int i : nums2)
            sum2 += i;

        double result = (sum1 / length1 + sum2 / length2)/2;
        return result;
    }

}
