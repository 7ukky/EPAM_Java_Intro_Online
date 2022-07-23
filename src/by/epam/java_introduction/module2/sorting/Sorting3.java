package by.epam.java_introduction.module2.sorting;

// Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an.
// Требуется переставить элементы так, чтобы они были расположены по убыванию.
// Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
// а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
// Написать алгоритм сортировки выбором.

import java.util.Random;

public class Sorting3 {

    public static void main(String[] args) {

        int[] array = new int[10];

        initAscendingArray(array);
        printArray(array, "Исходная последовательность:");

        sortArrayDescending(array);
        printArray(array, "Отсортированная последовательность:");

    }


    public static void sortArrayDescending(int[] array) {

        int maxPos;
        int temp;


        for (int i = 0; i < array.length; i++) {

            maxPos = i;

            for (int j = i; j < array.length; j++) {

                if (array[j] > array[maxPos]) {

                    maxPos = j;

                }

            }

            temp = array[i];
            array[i] = array[maxPos];
            array[maxPos] = temp;

        }

    }


    public static void sortArrayAscending(int[] array) {

        int minPos;
        int temp;


        for (int i = 0; i < array.length; i++) {

            minPos = i;

            for (int j = i; j < array.length; j++) {

                if (array[j] < array[minPos]) {

                    minPos = j;

                }

            }

            temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;

        }

    }


    public static void initAscendingArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);

        }

        sortArrayAscending(array);

    }


    public static void printArray(int[] array, String message) {

        System.out.println("\n" + message);

        for (int j : array) {

            System.out.print(j + " ");

        }

        System.out.println();

    }

}
