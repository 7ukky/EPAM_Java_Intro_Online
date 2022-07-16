package by.epam.java_introduction.module2.two_dimensional_array;

// Сформировать квадратную матрицу порядка N по правилу:

// A[I, J] = sin((I^2 - J^2) / N ),

// и подсчитать количество положительных элементов в ней.

public class TwoDimensionalArray7 {


    public static void main(String[] args) {

        int n = 3;
        double[][] matrix;


        matrix = createMatrix(n);
        printMatrixAndQuantityOfPositiveElements(matrix);

    }


    public static double[][] createMatrix(int n) {

        double[][] matrix = new double[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / n);

            }

        }

        return matrix;

    }


    public static void printMatrixAndQuantityOfPositiveElements(double[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


        int counter = 0;


        for (double[] i : matrix) {

            for (double j : i) {

                if (j > 0) {

                    counter++;

                }

                System.out.printf("%.2f ", j);

            }

            System.out.println();

        }

        System.out.println("\nВ полученной матрице " + counter + " положительных элементов");

    }

}
