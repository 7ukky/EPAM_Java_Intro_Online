package by.epam.java_introduction.module2.one_dimensional_array;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

import java.util.Random;

public class OneDimensionalArray1 {


    public static void main(String[] args) {

        int k = 250;

        int n = 10;
        int[] array = new int[n];
        int[] b = null;

        initAndPrintArray(array);                   // Заполнение массива случайными натуральными числами
        printSumOfMultipleNumbers(array, k);

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("Первоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10) + 1;  // + 1 чтобы не было деления на 0
            System.out.print(array[i] + " ");

        }

    }


    public static void printSumOfMultipleNumbers(int[] array, int k) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (k % array[i] == 0) {

                sum += array[i];

            }
        }

        System.out.println("\n\nСумма элементов кратных " + k + " равняется " + sum);

    }

}
