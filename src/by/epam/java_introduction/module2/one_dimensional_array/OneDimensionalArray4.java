package by.epam.java_introduction.module2.one_dimensional_array;

// Даны действительные числа а1 ,а2 ,..., аn. Поменять местами наибольший и наименьший элементы

import java.util.Random;

public class OneDimensionalArray4 {


    public static void main(String[] args) {

        int n = 10;

        double[] array = new double[n];

        initAndPrintArray(array);
        swapElementsInArray(array);

    }


    public static void swapElementsInArray(double[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        int posMinElement = 0;
        int posMaxElement = 0;

        double buff;

        buff = array[0];

        for (int i = 0; i < array.length; i++) {

            if (buff > array[i]) {

                buff = array[i];
                posMinElement = i;

            }

        }

        for (int j = 0; j < array.length; j++) {

            if (buff < array[j]) {

                buff = array[j];
                posMaxElement = j;

            }

        }

        buff = array[posMinElement];
        array[posMinElement] = array[posMaxElement];
        array[posMaxElement] = buff;

        System.out.println("\n\nМассив после перестановки: ");

        for (double k : array) {

            System.out.printf("%.2f ", k);

        }

    }


    public static void initAndPrintArray(double[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        System.out.println("Первоначальный массив: ");

        Random random = new Random();


        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextDouble(200) - 100;  // - 100 чтобы заполнить также и отрицателными значениями
            System.out.printf("%.2f ", array[i]);

        }

    }

}
