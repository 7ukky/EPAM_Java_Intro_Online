package by.epam.java_introduction.module2.decomposition;

// Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

import java.util.Random;

public class Decomposition8 {


    public static void main(String[] args) {

        int n = 10;

        int k = 3;                  // номер первого элемента тройки

        int[] array = new int[n];

        initAndPrintArray(array);
        printSumOfTrio(array, k);

    }


    public static void printSumOfTrio(int[] array, int k) {

        int sum = 0;

        for (int j = k; j < k + 3; j++) {

            sum += array[j];

        }

        System.out.printf("\n\nСумма элементов массива с индексами [%d], [%d] и [%d] равняется %d\n", k, k + 1, k + 2, sum);

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
