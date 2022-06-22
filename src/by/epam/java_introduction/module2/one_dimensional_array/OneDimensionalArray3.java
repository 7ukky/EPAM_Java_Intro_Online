package by.epam.java_introduction.module2.one_dimensional_array;

// Дан массив действительных чисел, размерность которого N.
// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

import java.util.Random;

public class OneDimensionalArray3 {


    public static void main(String[] args) {

        int n = 10;

        int[] array = new int[n];

        initAndPrintArray(array);
        printQuantityOfElements(array);

    }


    public static void initAndPrintArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("Первоначальный массив: ");

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(200) - 100;  // - 100 чтобы заполнить также и отрицателными значениями
            System.out.print(array[i] + " ");

        }

    }


    public static void printQuantityOfElements(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        int quantity0fNegative = 0;
        int quantity0fPositive = 0;
        int quantity0fZero = 0;

        for (int j : array) {

            if (j == 0) {

                quantity0fZero++;
            }

            else if (j > 0) {

                quantity0fPositive++;
            }

            else {

                quantity0fNegative++;
            }

        }

        System.out.println("\n\nКоличество отрицательных элементов " + quantity0fNegative);
        System.out.println("Количество положительных элементов " + quantity0fPositive);
        System.out.println("Количество нулевых элементов " + quantity0fZero);

    }

}
