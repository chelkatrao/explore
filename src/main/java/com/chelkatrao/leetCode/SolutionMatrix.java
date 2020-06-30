package com.chelkatrao.leetCode;

import java.util.Random;

public class SolutionMatrix {

    public static void main(String[] args) {
        int[][] matrix = matrixGenerator(3);
        int max = getMaxElement(matrix);
        displayMatrix(matrix, max);
        System.out.println("max - " + max);
    }

    private static int[][] matrixGenerator(int size) {
        Random numberRandom = new Random();
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = numberRandom.nextInt(10);
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix, int max) {
        for (int[] ints : matrix) {
            boolean check = false;
            int counter = 1;
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
                if (ints[j] == max) {
                    check = true;
                }
                if (j == ints.length - 1 && check && counter == 1) {
                    System.out.println();
                    j = -1;
                    counter = 0;
                }
            }
            System.out.println();
        }
    }

    private static int getMaxElement(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j])
                    max = matrix[i][j];
            }
        }
        return max;
    }

}
