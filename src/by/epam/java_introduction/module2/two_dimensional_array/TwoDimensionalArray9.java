package by.epam.java_introduction.module2.two_dimensional_array;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
// столбец содержит максимальную сумму.

import java.util.Random;

public class TwoDimensionalArray9 {

    public static void main(String[] args) {

        int[][] matrix = new int[3][6];

        initMatrix(matrix);
        printSumOfColumns(matrix);

    }


    public static void printSumOfColumns(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }

        int[] array = new int[matrix[0].length];
        int maxSum = 0;
        int index = 0;


        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                array[j] += matrix[i][j];

            }

        }

        System.out.println("\nСумма элементов в кажом столбце матрицы:");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
            if (array[i] > maxSum) {

                maxSum = array[i];
                index = i + 1;

            }

        }

        System.out.println("\nМаксимальную сумму содержит " + index + " столбец");

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
