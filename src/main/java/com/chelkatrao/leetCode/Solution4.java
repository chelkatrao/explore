package com.chelkatrao.leetCode;

public class Solution4 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        int[] nums1 = new int[2];
        int[] nums2 = new int[2];
        nums1[0] = 1;
        nums1[1] = 2;

        nums2[0] = 3;
        nums2[1] = 4;

        System.out.println(solution4.findMedianSortedArrays(nums1, nums2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        int count2 = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (nums1.length > i) {
                mergedArray[i] = nums1[i];
            } else {
                mergedArray[i] = nums2[count2++];
            }
        }
        double result;
        mySort(mergedArray);
        if (mergedArray.length % 2 == 0) {
            int indexFirst = mergedArray.length / 2 - 1;
            int indexSecond = mergedArray.length / 2;
            result = ((double) mergedArray[indexFirst] + (double) mergedArray[indexSecond]) / 2d;
        } else {
            int index = mergedArray.length / 2;
            result = mergedArray[index];
        }

        for (int i : mergedArray) {
            System.out.println(i);
        }
        return result;
    }

    private static void mySort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }
            }
        }
    }

}
