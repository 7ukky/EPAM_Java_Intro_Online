package by.epam.java_introduction.module2.two_dimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//      1   1   1  ...  1   1   1
//      0   1   1  ...  1   1   0
//      0   0   1  ...  1   0   0
//     ... ... ... ... ... ... ...
//      0   1   1  ...  1   1   0
//      1   1   1  ...  1   1   1

public class TwoDimensionalArray6 {


    public static void main(String[] args) {

        int n = 8;
        int[][] matrix;


        matrix = createMatrix(n);
        printMatrix(matrix);

    }


    public static int[][] createMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length / 2; i++) {

            for (int j = i; j < matrix.length - i; j++) {

                matrix[i][j] = 1;
                matrix[matrix.length - i - 1][j] = 1;

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
