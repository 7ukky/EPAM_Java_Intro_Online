package by.epam.java_introduction.module2.one_dimensional_array;

// Дана последовательность действительных чисел а1 ,а2 ,..., аn.
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

import java.util.Random;

public class OneDimensionalArray2 {


    public static void main(String[] args) {

        int z = 5;
        int n = 10;


        int[] array = new int[n];
        int[] a = null;

        initAndPrintArray(array);
        replaceInArray(array, z);

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        System.out.println("Изначальная последовательность: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");

        }
    }


    public static void replaceInArray(int[] array, int z) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        int replacementCounter = 0;

        System.out.println("\n\nПоследовательность после замены: ");

        for (int i = 0; i < array.length; i++) {

            if (array[i] > z) {

                array[i] = z;
                replacementCounter++;

            }

            System.out.print(array[i] + " ");

        }

        System.out.println("\n\nКоличество замен: " + replacementCounter);

    }

}
