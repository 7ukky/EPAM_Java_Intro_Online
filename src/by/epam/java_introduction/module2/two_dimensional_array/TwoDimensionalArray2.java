package by.epam.java_introduction.module2.two_dimensional_array;

// Дана квадратная матрица. Вывести на экран элементы, стоящие на главной диагонали

import java.util.Random;

public class TwoDimensionalArray2 {


    public static void main(String[] args) {

        int n = 4;
        int[][] matrix = new int[n][n];

        initMatrix(matrix);
        printDiagonalElements(matrix);

    }


    public static void printDiagonalElements(int[][] matrix) {

        System.out.println("\nЭлементы стоящие на главной диагонали:");

        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][i] + " ");

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
