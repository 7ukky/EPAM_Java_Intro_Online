package by.epam.java_introduction.module2.two_dimensional_array;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Random;

public class TwoDimensionalArray12 {

    public static void main(String[] args) {

        int n = 5;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);

        sortMatrixLinesAscending(matrix);
        sortMatrixLinesDescending(matrix);

    }


    public static void sortMatrixLinesDescending(int[][] initialMatrix) {

        int length = initialMatrix.length;

        int[] line;
        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {

            line = initialMatrix[i].clone();
            sortArrayDescending(line);
            matrix[i] = line;

        }

        System.out.println("\nМатрица с отсортированными по убыванию строками:");
        printMatrix(matrix);

    }


    public static void sortMatrixLinesAscending(int[][] initialMatrix) {

        int length = initialMatrix.length;

        int[] line;
        int[][] matrix = new int[length][length];

        for (int i = 0; i < length; i++) {

            line = initialMatrix[i].clone();
            sortArrayAscending(line);
            matrix[i] = line;

        }

        System.out.println("\nМатрица с отсортированными по возрастанию строками:");
        printMatrix(matrix);

    }


    public static void sortArrayDescending(int[] array) {

        int maxPos;
        int temp;


        for (int i = 0; i < array.length; i++) {

            maxPos = i;

            for (int j = i; j < array.length; j++) {

                if (array[j] > array[maxPos]) {

                    maxPos = j;

                }

            }

            temp = array[i];
            array[i] = array[maxPos];
            array[maxPos] = temp;

        }

    }


    public static void sortArrayAscending(int[] array) {

        int minPos;
        int temp;


        for (int i = 0; i < array.length; i++) {

            minPos = i;

            for (int j = i; j < array.length; j++) {

                if (array[j] < array[minPos]) {

                    minPos = j;

                }

            }

            temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;

        }

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


    public static void initMatrix(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


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


}
