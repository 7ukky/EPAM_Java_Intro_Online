package by.epam.java_introduction.module2.one_dimensional_array;

// Даны действительные числа а1 ,а2 ,..., а(2n).
// Найти max(a1 + a(2n), a2 + a(2n - 1), ..., an + a(n + 1)

import java.util.Random;

public class OneDimensionalArray7 {


    public static void main(String[] args) {

        int n = 5;

        int[] array = new int[2 * n];

        initAndPrintArray(array);
        printMaxValue(array);

    }


    public static void printMaxValue(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        int size;
        int temp;
        int[] arrayOfSums;


        size = array.length / 2;
        arrayOfSums = new int[size];

        System.out.println("\n----------------------");

        for (int i = 0; i < arrayOfSums.length; i++) {

            arrayOfSums[i] = array[i] + array[array.length - i - 1];
            System.out.print(arrayOfSums[i] + " ");

        }

        temp = arrayOfSums[0];

        for (int j : arrayOfSums) {

            temp = Math.max(temp, j);

        }

        System.out.println("\n\nmax = " + temp);

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("Первоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(30) - 15;
            System.out.print(array[i] + " ");

        }

    }

}
