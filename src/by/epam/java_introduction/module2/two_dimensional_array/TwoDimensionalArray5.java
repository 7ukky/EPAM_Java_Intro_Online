package by.epam.java_introduction.module2.two_dimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//      1   1   1  ...  1   1   1
//      2   2   2  ...  2   2   0
//      3   3   3  ...  3   0   0
//     ... ... ... ... ... ... ...
//     n-1 n-1  0  ...  0   0   0
//      n   0   0  ...  0   0   0

public class TwoDimensionalArray5 {


    public static void main(String[] args) {

        int n = 6;
        int[][] matrix;


        matrix = createMatrix(n);
        printMatrix(matrix);

    }


    public static int[][] createMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length - i; j++) {

                matrix[i][j] = i + 1;

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
