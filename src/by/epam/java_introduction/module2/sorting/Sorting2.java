package by.epam.java_introduction.module2.sorting;

// Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

import java.util.Random;

public class Sorting2 {

    public static void main(String[] args) {

        int[] array1 = new int[6];
        int[] array2 = new int[7];
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


        int resultLength;
        int[] resultArray;


        resultLength = array1.length + array2.length;
        resultArray = new int[resultLength];

        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {

            if (array1[i] <= array2[j]) {

                resultArray[i + j] = array1[i];
                i++;
            }
            else {

                resultArray[i + j] = array2[j];
                j++;

            }

        }

        if (i == array1.length) {

            for (; j < array2.length; j++) {

                resultArray[i + j] = array2[j];

            }

        }
        else {

            for (; i < array1.length; i++) {

                resultArray[i + j] = array1[i];

            }

        }

        return resultArray;

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

