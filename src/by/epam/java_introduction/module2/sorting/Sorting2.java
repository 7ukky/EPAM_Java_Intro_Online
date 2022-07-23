package by.epam.java_introduction.module2.sorting;

// Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

import java.util.Random;

public class Sorting2 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] resultArray;

        initAscendingArray(array1);
        initAscendingArray(array2);

        resultArray = getResultArray(array1, array2);

        if (resultArray != null) {

            System.out.println("\nИсходные последовательности:");

            printArray(array1);

            printArray(array2);

            System.out.println("\nКонечная последовательность:");
            printArray(resultArray);

        }

    }


    public static int[] getResultArray(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) {

            System.out.println("\nПередана пустая ссылка");
            return null;

        }


        int length;
        int[] array;

        length = array1.length + array2.length;
        array = new int[length];

        for (int i = 0; i < array1.length; i++) {

            array[i] = array1[i];

        }

        for (int i = 0; i < array2.length; i++) {

            array[i + array1.length] = array2[i];

        }

        sortAscending(array);

        return array;

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

        sortAscending(array);

    }


    public static void sortAscending(int[] array) {

        boolean needIteration;
        int temp;

        do {

            needIteration = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i - 1] > array[i]) {

                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    needIteration = true;

                }

            }

        }
        while (needIteration);

    }


    public static void printArray(int[] array) {

        for (int j : array) {

            System.out.print(j + " ");

        }

        System.out.println();

    }

}

