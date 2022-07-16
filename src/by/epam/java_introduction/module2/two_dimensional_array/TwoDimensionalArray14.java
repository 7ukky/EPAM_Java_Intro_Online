package by.epam.java_introduction.module2.two_dimensional_array;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
// единиц равно номеру столбца

import java.util.Random;

public class TwoDimensionalArray14 {

    public static void main(String[] args) {

        int[][] matrix;

        matrix = createMatrix();
        printMatrix(matrix);

    }

    public static int[][] createMatrix() {

        int[][] matrix;
        int m, n;
        int counter;
        int line;

        Random random = new Random();


        m = random.nextInt(10) + 1;
        n = random.nextInt(10) + 1;


        matrix = m >= n ? new int[m][n] : new int[n][m];


        for (int i = 0; i < matrix[0].length; i++) {

            counter = 0;

            while (counter < i + 1) {

                line = random.nextInt(matrix.length);

                if (!(matrix[line][i] == 1)) {

                    matrix[line][i] = 1;
                    counter++;

                }

            }

        }

        return matrix;

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
