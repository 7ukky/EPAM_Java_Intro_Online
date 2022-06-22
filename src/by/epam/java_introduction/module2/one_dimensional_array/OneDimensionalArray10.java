package by.epam.java_introduction.module2.one_dimensional_array;

//  Дан целочисленный массив с количеством элементов п.
//  Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
//  Примечание. Дополнительный массив не использовать

import java.util.Random;

public class OneDimensionalArray10 {


    public static void main(String[] args) {

        int n = 9;

        int[] array = new int[n];

        initAndPrintArray(array);
        printCompressedArray(array);

    }


    private static void printCompressedArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        if (array.length < 2) {

            System.out.println("Массив состоит из одного элемента");
            return;

        }


        int startPosition;

        startPosition = array.length % 2;

        if (startPosition == 0) {

            startPosition = array.length / 2;

        }

        else {

            startPosition = array.length / 2 + 1;

        }


        for (int i = 2, counter = 1; i < array.length; i += 2, counter++) {

            array[counter] = array[i];

        }

        for (int j = startPosition; j < array.length; j++) {

            array[j] = 0;

        }

        System.out.println("\n\nСжатый массив: ");

        for (int k : array) {

            System.out.print(k + " ");

        }

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("\nПервоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(30) - 15;
            System.out.print(array[i] + " ");

        }

    }

}
