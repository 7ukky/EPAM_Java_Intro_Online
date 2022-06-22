package by.epam.java_introduction.module2.one_dimensional_array;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них

import java.util.Random;

public class OneDimensionalArray9 {


    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        initAndPrintArray(array);
        printMinMostPopularElement(array);

    }


    public static void printMinMostPopularElement(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        int[] detectionFreq = new int[array.length];

        int resultValue = array[0];
        int resultFreq = detectionFreq[0];

        for (int i = 0; i < array.length; i++) {

            for (int j : array) {

                if (array[i] == j) {

                    detectionFreq[i]++;

                }

            }

        }

        for (int i = 0; i < detectionFreq.length; i++) {

            if (detectionFreq[i] > resultFreq) {

                resultFreq = detectionFreq[i];
                resultValue = array[i];

            }

            if ((resultFreq == detectionFreq[i]) && (array[i] < resultValue)) {

                resultValue = array[i];

            }

        }

        System.out.println("\n\nМинимальное наиболее встечающееся значение в массиве: " + resultValue);

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
