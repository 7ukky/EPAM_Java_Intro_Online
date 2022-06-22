package by.epam.java_introduction.module2.one_dimensional_array;

// Дана последовательность целых чисел а1 ,а2 ,..., аn.
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn)

import java.util.Random;

public class OneDimensionalArray8 {


    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        initAndPrintArray(array);
        printArrayWithoutMinElement(array);

    }


    private static void printArrayWithoutMinElement(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        int temp;

        temp = array[0];

        for (int i : array) {

            if (temp > i) {

                temp = i;

            }

        }

        System.out.println("\n\nМинимальный элемент: " + temp);
        System.out.println("\nНовая последовательность: ");

        for (int j : array) {

            if (j != temp) {

                System.out.print(j + " ");

            }

        }

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("Изначальная последовательность: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(30) - 15;
            System.out.print(array[i] + " ");

        }

    }

}
