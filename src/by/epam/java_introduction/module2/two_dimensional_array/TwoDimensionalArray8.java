package by.epam.java_introduction.module2.two_dimensional_array;

// В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
// на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
// пользователь с клавиатуры.

import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray8 {


    public static void main(String[] args) {

        int column1, column2;
        int n = 3;
        int m = 6;

        int[][] matrix = new int[n][m];


        initMatrix(matrix);

        do {

            column1 = getNumberFromConsole("\nВведите номер первого столбца:");
            column2 = getNumberFromConsole("\nВведите номер второго столбца:");

        }
        while ((column1 <= 0 || column1 > m) || (column2 < 0 || column2 > m));

        swapColumns(matrix, column1, column2);

    }


    public static void swapColumns(int[][] matrix, int column1, int column2) {

        int[] temp = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {

            temp[i] = matrix[i][column1 - 1];
            matrix[i][column1 - 1] = matrix[i][column2 - 1];
            matrix[i][column2 - 1] = temp[i];

        }

        System.out.println("\nМатрица после перестановки:");
        printMatrix(matrix);

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

