package by.epam.java_introduction.module2.sorting;

// 5. Сортировка вставками. Дана последовательность чисел a1 , a2, ..., an.
// Требуется переставить числа в порядке возрастания. Делается это следующим образом.
// Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
// Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
// последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
// не будут перебраны.
// Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
// Двоичный поиск оформить в виде отдельной функции.

import java.util.Random;

public class Sorting5 {

    public static void main(String[] args) {

        int[] array = new int[10];

        initArray(array);
        printArray(array, "Исходная последовательность:");

        sortArrayAscending(array);
        printArray(array, "Отсортированная последовательность:");


    }


    public static void sortArrayAscending(int[] array) {

        int value;
        int pos;

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i - 1]) {

                continue;

            }

            value = array[i];

            pos = getPosToInsert(array, i - 1, value);

            for (int j = i; j > pos; j--) {

                 array[j] = array[j - 1];

            }

            array[pos] = value;

        }

    }


    public static int getPosToInsert(int[] array, int limiterPos, int value) {

        int low = 0;
        int high = limiterPos;
        int mid;

        while (low < high) {

            mid = (low + high) >>> 1;

            if (value < array[mid]) {

                high = mid;

            }

            else {

                low = mid + 1;

            }

        }

        return low;

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
