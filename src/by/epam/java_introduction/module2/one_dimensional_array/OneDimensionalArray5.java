package by.epam.java_introduction.module2.one_dimensional_array;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Random;

public class OneDimensionalArray5 {


    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        initAndPrintArray(array);
        printElements(array);

    }


    public static void printElements(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("\n---------------------");

        for (int i = 0; i < array.length; i++) {

            if (array[i] > i + 1) {

                System.out.print(array[i] + " ");

            }

        }

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("Первоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");

        }

    }

}
