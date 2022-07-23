package by.epam.java_introduction.module2.sorting;

// Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
// Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
// последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Random;

public class Sorting7 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        initAscendingArray(array1);
        initAscendingArray(array2);

        insertArrayInArray(array1, array2);

    }


    public static void insertArrayInArray(int[] baseArray, int[] insertArray) {

        printArrayWithoutZeros(baseArray, "Исходная последовательность:");

        printArrayWithoutZeros(insertArray, "Последовательность, элементы которой необходимо вставить в исходную:");

        int[] array = new int[baseArray.length + insertArray.length];

        String message;
        int value;


        for (int m = 0; m < baseArray.length; m++) {

            array[m] = baseArray[m];

        }

        for (int i = 0; i < insertArray.length; i++) {

            value = insertArray[i];

            for (int j = 0; j < baseArray.length + i; j++) {

                if (value <= array[j]) {

                    message = "Число " + value + " необходимо вствавить перед " + (j + 1) + " элементом:";

                    for (int k = baseArray.length + i; k > j; k--) {

                        array[k] = array[k - 1];

                    }

                    array[j] = value;
                    printArrayWithoutZeros(array, message);
                    break;

                }

                else if (j == baseArray.length + i - 1) {

                    message = "Число " + value + " необходимо вствавить после " + (j + 1) + " элемента:";
                    array[baseArray.length + i] = value;
                    printArrayWithoutZeros(array, message);

                }

            }

        }

    }


    public static void initAscendingArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(15) + 1;

        }

        sortArrayAscending(array);

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


    public static void printArrayWithoutZeros(int[] array, String message) {

        System.out.println("\n" + message);

        for (int j : array) {

            if (j != 0) {

                System.out.print(j + " ");

            }

        }

        System.out.println();

    }

}
