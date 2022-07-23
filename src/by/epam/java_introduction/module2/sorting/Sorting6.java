package by.epam.java_introduction.module2.sorting;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
// Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
// Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка
// и сдвигаются на один элемент назад.
// Составить алгоритм этой сортировки.

import java.util.Random;

public class Sorting6 {

    public static void main(String[] args) {

        int[] array1 = new int[10];
        int[] array2;

        initArray(array1);
        printArray(array1, "Исходный массив:");

        array2 = array1.clone();

        sortArrayAscendingByTask(array1);
        printArray(array1, "Отсортированный массив согласно методу сортировки из задания:");

        sortArrayAscendingByShell(array2);
        printArray(array2, "Отсортированный массив согласно методу сортировки Шелла:");

    }


    public static void sortArrayAscendingByTask(int[] array) {

        hSort(array, 1);

    }


    public static void sortArrayAscendingByShell(int[] array) {

        int h = 1;

        while (h * 3 < array.length) {

            h = h * 3 + 1;

        }

        while (h >= 1) {

            hSort(array, h);
            h = h / 3;

        }

    }


    private static void hSort(int[] array, int h) {

        int temp;

        for (int i = h; i < array.length; i++) {

            for (int j = i; j >= h; j = j - h) {

                if (array[j] < array[j - h]) {

                    temp = array[j];
                    array[j] = array[j - h];
                    array[j - h] = temp;

                }

                else {

                    break;

                }

            }

        }

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


    public static void printArray(int[] array, String message) {

        System.out.println("\n" + message);

        for (int j : array) {

            System.out.print(j + " ");

        }

        System.out.println();

    }

}
