package by.epam.java_introduction.module2.two_dimensional_array;

// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

import java.util.Random;

public class TwoDimensionalArray15 {

    public static void main(String[] args) {

        int[][] matrix = new int[3][6];

        initMatrix(matrix);
        replaceOddElementsByMaxValue(matrix);

    }


    public static void replaceOddElementsByMaxValue(int[][] matrix) {

        int maxValue;

        maxValue = getMaxValue(matrix);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (isOdd(matrix[i][j])) {

                    matrix[i][j] = maxValue;

                }

            }

        }

        System.out.println("\nПолученная матрица: ");
        printMatrix(matrix);

    }


    public static int getMaxValue(int[][] matrix) {

        int maxValue;

        maxValue = matrix[0][0];

        for (int[] i : matrix) {

            for (int j : i) {

                if (j > maxValue) {

                    maxValue = j;

                }

            }

        }

        System.out.println("\nНаибольшее значение: " + maxValue);
        return maxValue;

    }


    public static boolean isOdd(int num) {

        return num % 2 != 0;

    }


    public static void initMatrix(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }

        int temp;

        Random random = new Random();

        System.out.println("\nИсходная матрица:");


        for (int i = 0; i < matrix.length; i++) {


            System.out.println();

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(10);
                System.out.print(matrix[i][j] + " ");

            }

        }

        System.out.println();

    }


    public static void printMatrix(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


        for (int[] i : matrix) {

            for (int j : i) {

                System.out.print(j + " ");

            }

            System.out.println();

        }

    }

}
