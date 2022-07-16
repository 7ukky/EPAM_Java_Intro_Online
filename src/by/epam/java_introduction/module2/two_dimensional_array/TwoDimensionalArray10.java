package by.epam.java_introduction.module2.two_dimensional_array;

// Найти положительные элементы главной диагонали квадратной матрицы.

import java.util.Random;

public class TwoDimensionalArray10 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        initMatrix(matrix);
        printPositiveElementsOfMainDiagonal(matrix);

    }


    public static void printPositiveElementsOfMainDiagonal(int[][] matrix) {

        System.out.println("\nПоложительные элементы главной диагонали:");

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i][i] > 0) {

                System.out.print(matrix[i][i] + " ");

            }

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
