package by.epam.java_introduction.module2.sorting;

// Сортировка обменами. Дана последовательность чисел a1 >= a2 >= ... >= an. Требуется переставить числа в
// порядке возрастания. Для этого сравниваются два соседних числа ai ai+1. Если ai > ai+1, то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Random;

public class Sorting4 {

    public static void main(String[] args) {

        int[] array = new int[10];


        initDescendingArray(array);
        printArray(array, "Исходная последовательность:");

        sortAscending(array);
        printArray(array, "Отсортированная последовательность:");

    }


    public static void initDescendingArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);

        }

        sortDescending(array);

    }


    public static void sortAscending(int[] array) {

        boolean needIteration;
        int temp;
        int counter = 0;

        do {

            needIteration = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i - 1] > array[i]) {

                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    counter++;
                    needIteration = true;

                }

            }

        }
        while (needIteration);

        System.out.println("\nКоличество проведенных перестановок: " + counter);

    }


    public static void sortDescending(int[] array) {

        boolean needIteration;
        int temp;

        do {

            needIteration = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i - 1] < array[i]) {

                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    needIteration = true;

                }

            }

        }
        while (needIteration);

    }


    public static void printArray(int[] array, String message) {

        System.out.println("\n" + message);

        for (int j : array) {

            System.out.print(j + " ");

        }

        System.out.println();

    }

}
