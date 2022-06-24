package by.epam.java_introduction.module2.decomposition;

// Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
// которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Random;

public class Decomposition5 {


    public static void main(String[] args) {

        int n = 10;
        int[] array = new int[n];

        initAndPrintArray(array);
        printSecondLargestElement(array);

    }


    private static void printSecondLargestElement(int[] array) {

        int maxValue;
        int value;

        maxValue = getMaxValueFromArray(array);
        value = array[0];

        for (int i : array) {

            if (i > value && i < maxValue) {

                value = i;

            }

        }

        System.out.println("\n\nВторое по величине число в массиве: " + value);

    }

    public static int getMaxValueFromArray(int[] array) {

        int maxValue;

        maxValue = array[0];

        for (int j : array) {

            if (j > maxValue) {

                maxValue = j;

            }

        }

        return maxValue;

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("\nПервоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(20) - 10;
            System.out.print(array[i] + " ");

        }

    }

}
