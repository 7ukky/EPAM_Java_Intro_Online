package by.epam.java_introduction.module2.two_dimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

//      1   2    3   ...  n
//      n  n-1  n-2  ...  1
//      1   2    3   ...  n
//      n  n-1  n-2  ...  1
//     ... ...  ...  ... ...
//      n  n-1  n-2  ...  1

public class TwoDimensionalArray4 {

    public static void main(String[] args) {

        int n = 6;
        int[][] matrix;


        matrix = createMatrix(n);
        printMatrix(matrix);

    }


    public static int[][] createMatrix(int n) {

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i += 2) {

            for (int j = 1; j <= n; j++) {

                matrix[i][j - 1] = j;

            }

        }

        for (int i = 1; i < matrix.length; i += 2) {

            for (int j = 0, temp = n; j < matrix.length; j++, temp--) {

                matrix[i][j] = temp;

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
