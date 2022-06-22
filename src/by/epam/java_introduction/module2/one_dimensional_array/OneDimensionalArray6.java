package by.epam.java_introduction.module2.one_dimensional_array;

// Задана последовательность N вещественных чисел.
// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.util.Random;

public class OneDimensionalArray6 {


    public static void main(String[] args) {

        int n = 10;

        double[] array = new double[n];

        initAndPrintArray(array);
        printSumOfPrimeElements(array);

    }


    public static void printSumOfPrimeElements(double[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (isPrime(i + 1)) {

                sum += array[i];

            }

        }

        System.out.printf("\nСумма чисел, порядковые номера которых являются простыми числами раянется %.2f", sum);

    }


    public static boolean isPrime(int num) {

        if (num < 2) {

            return false;

        }

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                return false;

            }

        }

        return true;

    }


    public static void initAndPrintArray(double[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        System.out.println("Изначальная последовательность: ");

        Random random = new Random();


        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextDouble(20) - 10;
            System.out.printf("%.2f ", array[i]);

        }

    }

}
