package org.example.fx;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = createMatrix(scanner);
        int[][] matrix2 = createMatrix(scanner);

        int[][] sum = addMatrix(matrix1, matrix2);

        printMatrix(matrix1);
        System.out.println();
        printMatrix(matrix2);
        System.out.println();
        printMatrix(sum);
    }

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[3][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sum;
    }

    private static void printMatrix(int[][] matrix1) {
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                System.out.print(matrix1[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(Scanner scanner) {
        System.out.println("Enter 3 by 3 matrix: ");
        int[][] matrix = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
