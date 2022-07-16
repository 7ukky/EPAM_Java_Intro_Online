package by.epam.java_introduction.module2.two_dimensional_array;

// Магическим квадратом порядка n называется квадратная матрица размера n x n,составленная из чисел 1, 2, 3, ..., n^2
// так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
// Построить такой квадрат. Пример магического квадрата порядка 3:

//  6 1 8
//  7 5 3
//  2 9 4

import java.util.Scanner;

public class TwoDimensionalArray16 {

    public static void main(String[] args) {

        int n;
        int[][] matrix;

        do {

            n = getNumberFromConsole("\nВведите порядок магического квадрата, но не меньше 3-го:");

        }
        while ((n <= 2));

        matrix = createMagicSquare(n);
        printMatrix(matrix);
        printIsMagic(matrix);

    }


    public static int[][] createMagicSquare(int order) {

        if (order % 2 != 0) {

            return createMagicSquareOfOddOrder(order);

        }

        else {

            return order % 4 != 0 ? createMagicSquareOfSingleEvenOrder(order) : createMagicSquareOfDoubleEvenOrder(order);

        }

    }


    public static int[][] createMagicSquareOfSingleEvenOrder(int order) {

        int[][] tempMatrix;
        int[][] matrix = new int[order][order];

        int size = order / 2;

        tempMatrix = createMagicSquareOfOddOrder(size);

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                matrix[i][j] = tempMatrix[i][j];
                matrix[i][j + size] = tempMatrix[i][j] + size * size * 2;
                matrix[i + size][j] = tempMatrix[i][j] + size * size * 3;
                matrix[i + size][j + size] = tempMatrix[i][j] + size * size;

            }

        }

        int move = 0;

        for (int i = 6; i < order; i++) {

            if ((i % 4 != 0) && (i % 2 == 0)) move++;

        }

        for (int j = matrix.length / 2 - move; j <= matrix.length / 2 + move - 1; j++) {

            for (int i = 0; i < tempMatrix.length; i++) {

                int key = matrix[i][j];
                matrix[i][j] = matrix[size + i][j];
                matrix[size + i][j] = key;

            }

        }

        for (int j = 0; j <= 1; j++) {

            if (j == 0) {

                int key = matrix[0][0];
                matrix[0][0] = matrix[size][0];
                matrix[size][0] = key;

            }

            if (j == 1) {

                int key = matrix[size - 1][0];
                matrix[size - 1][0] = matrix[order - 1][0];
                matrix[order - 1][0] = key;

            }

        }

        for (int j = size + 1; j < order - 1; j++) {

            for (int i = 1; i < size - 1; i++) {

                int key = matrix[i][1];
                matrix[i][1] = matrix[size + i][1];
                matrix[size + i][1] = key;

            }

        }

        return matrix;

    }


    public static int[][] createMagicSquareOfDoubleEvenOrder(int order) {

        int[][] tempMatrix;
        int[][] matrix;

        int size = 4;

        tempMatrix = createMatrixFilledInDescendingOrder(order);
        matrix = createMatrixFilledInAscendingOrder(order);

        for (int i = 0; i < order; i += size) {

            for (int j = 0; j < order; j += size) {

                for (int k = 0; k < size; k++) {

                    matrix[k + i][k + j] = tempMatrix[k + i][k + j];
                    matrix[k + i][size - 1 - k + j] = tempMatrix[k + i][size - 1 - k + j];

                }

            }

        }

        return matrix;

    }


    public static int[][] createMagicSquareOfOddOrder(int order) {

        int[][] matrix = new int[order][order];

        int x = order / 2;
        int y = 0;
        int counter = 0;

        do {

            counter++;

            matrix[y][x] = counter;

            if ((y - 1 < 0)) {

                if (x + 1 == order) {

                    y++;

                }

                else {

                    if (matrix[order - 1][x + 1] == 0) {

                        x++;

                    }

                    y = order - 1;

                    while (matrix[y][x] != 0) {

                        y--;

                    }

                }

            }

            else if (x + 1 == order) {

                x = 0;
                y--;

            }

            else if (matrix[y - 1][x + 1] != 0) {

                y++;

            }

            else {

                y--;
                x++;

            }

        }
        while (counter != Math.pow(order, 2));

        return matrix;

    }


    public static void printMatrix(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


        for (int[] i : matrix) {

            for (int j : i) {

                if (j > 100) {

                    System.out.print(j + " ");

                }

                else if (j > 10) {

                    System.out.print(j + "  ");

                }

                else {

                    System.out.print(j + "   ");

                }

            }

            System.out.println();

        }

    }


    public static void printIsMagic(int[][] matrix) {

        int sum1 = 0;
        int sum2 = 0;
        int magicNum;

        magicNum = (int) ((matrix.length * (Math.pow(matrix.length, 2) + 1)) / 2);

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix.length; j++) {

                sum1 += matrix[i][j];
                sum2 += matrix[j][i];

            }

            if (sum1 != magicNum || sum2 != magicNum) {

                System.out.println("\nПолученный квадрат не является магическим");
                return;

            }

            sum1 = 0;
            sum2 = 0;

        }

        for (int i = 0, j = 0; i < matrix.length; i++, j++) {

            sum1 += matrix[i][j];
            sum2 += matrix[i][matrix.length - 1 - i];

        }

        if (sum1 != magicNum || sum2 != magicNum) {

            System.out.println("\nПолученный квадрат не является магическим");
            return;

        }

        System.out.println("\nПолученный квадрат является магическим");

    }


    public static int[][] createMatrixFilledInAscendingOrder(int order) {

        int[][] matrix = new int[order][order];
        int counter = 1;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++, counter++) {

                matrix[i][j] = counter;

            }

        }

        return matrix;

    }


    public static int[][] createMatrixFilledInDescendingOrder(int order) {

        int[][] matrix = new int[order][order];
        int counter = order * order;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++, counter--) {

                matrix[i][j] = counter;

            }

        }

        return matrix;

    }


    public static int getNumberFromConsole(String message) {

        int value;

        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        if (!scanner.hasNextInt()) {

            scanner.next();
            System.out.println("Некорректный ввод");
            System.out.println(message);

        }

        value = scanner.nextInt();

        return value;

    }

}
