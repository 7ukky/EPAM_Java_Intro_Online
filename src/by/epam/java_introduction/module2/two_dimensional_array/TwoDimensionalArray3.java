package by.epam.java_introduction.module2.two_dimensional_array;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы

import java.util.Random;

public class TwoDimensionalArray3 {


    public static void main(String[] args) {

        int k = 1;
        int p = 1;
        int[][] matrix = new int[3][6];

        initMatrix(matrix);
        printStringAndColumn(matrix, k, p);

    }


    public static void printStringAndColumn(int[][] matrix, int lineIndex, int columIndex) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


        System.out.println("\nСтрока под номером " + lineIndex + ":");

        for (int i = 0; i < matrix[lineIndex - 1].length; i++) {

            System.out.print(matrix[lineIndex - 1][i] + " ");

        }

        System.out.println("\nСтолбец под номером " + columIndex + ":");

        for (int j = 0; j < matrix.length; j++) {

            System.out.println(matrix[j][columIndex - 1]);

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
