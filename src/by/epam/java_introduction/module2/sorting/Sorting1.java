package by.epam.java_introduction.module2.sorting;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого, при этом не используя
// дополнительный массив.

import java.util.Random;

public class Sorting1 {

    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[10];
        int[] resultArray;

        int k = 3;

        initArray(array1);
        initArray(array2);

        resultArray = getResultArray(array1, array2, k);

        if (resultArray != null) {

            System.out.println("\nИсходные массивы:");

            printArray(array1);

            printArray(array2);

            System.out.println("\nКонечный массив:");
            printArray(resultArray);

        }

    }


    public static int[] getResultArray(int[] baseArray, int[] insertArray, int pos) {

        if (baseArray == null || insertArray == null) {

            System.out.println("\nПередана пустая ссылка");
            return null;

        }


        int length;
        int[] array;

        length = baseArray.length + insertArray.length;
        array = new int[length];

        for (int i = 0; i < array.length; i++) {

            if (i < pos) {

                array[i] = baseArray[i];

            }

            else if (i < pos + insertArray.length) {

                array[i] = insertArray[i - pos];

            }

            else {

                array[i] = baseArray[i - insertArray.length];

            }


        }

        return array;

    }


    public static void initArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);

        }

    }


    public static void printArray(int[] array) {

        for (int j : array) {

            System.out.print(j + " ");

        }

        System.out.println();

    }

}
