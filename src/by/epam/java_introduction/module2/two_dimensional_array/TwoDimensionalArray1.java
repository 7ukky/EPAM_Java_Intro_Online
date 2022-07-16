package by.epam.java_introduction.module2.two_dimensional_array;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

import java.util.Random;

public class TwoDimensionalArray1 {


    public static void main(String[] args) {

        int[][] matrix = new int[3][6];

        initMatrix(matrix);
        printOddColumns(matrix);

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


    public static void printOddColumns(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }

        System.out.println("\nСтолбцы удовлетворяющие условию:");

        for (int i = 0; i < matrix[0].length; i += 2) {

            if (matrix[0][i] > matrix[matrix.length - 1][i]) {

                System.out.println();

                for (int j = 0; j < matrix.length; j++) {

                    System.out.println(matrix[j][i]);

                }

            }

        }

    }

}
