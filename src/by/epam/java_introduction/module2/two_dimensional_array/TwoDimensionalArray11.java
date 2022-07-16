package by.epam.java_introduction.module2.two_dimensional_array;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
// которых число 5 встречается три и более раз.

import java.util.Random;

public class TwoDimensionalArray11 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][20];

        initMatrix(matrix);
        printLinesWithTripleFive(matrix);

    }


    public static void printLinesWithTripleFive(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }


        int counter;

        System.out.println("\nНомера строк в которых число 5 встречается три и более раз:");

        for (int i = 0; i < matrix.length; i++) {

            counter = 0;

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 5) {

                    counter++;

                }

                if (counter == 3) {

                    System.out.print(i + 1 + " ");
                    break;

                }

            }

        }

    }


    public static void initMatrix(int[][] matrix) {

        if (matrix == null) {

            System.out.println("\nПередана пустая ссылка");
            return;

        }

        int temp;

        Random random = new Random();

        System.out.println("\nИсходная матрица:");


        for (int i = 0; i < matrix.length; i++) {


            System.out.println();

            for (int j = 0; j < matrix[i].length; j++) {

                temp = random.nextInt(16);
                matrix[i][j] = temp;

                if (temp < 10) {

                    System.out.print(matrix[i][j] + "  ");

                }

                else {

                    System.out.print(matrix[i][j] + " ");

                }

            }

        }

        System.out.println();

    }

}
