package by.epam.java_introduction.module2.decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
// из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Random;


public class Decomposition4 {

    public static void main(String[] args) {

        int n = 3;
        int[] array = new int[2 * n];

        initArray(array);
        printCoordinatesFromArray(array);
        printMostDistancePoints(array);

    }


    public static void printMostDistancePoints(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        int res_x1 = 0;
        int res_y1 = 0;
        int res_x2 = 0;
        int res_y2 = 0;

        int temp_x1;
        int temp_y1;
        int temp_x2;
        int temp_y2;

        double distance;
        double temp_distance;

        distance = getDistance(array[0], array[array.length / 2], array[1], array[array.length / 2 + 1]);


        for (int i = 0; i < array.length / 2; i++) {

            temp_x1 = array[i];
            temp_y1 = array[i + array.length / 2];

            for (int j = 0; j < array.length / 2; j++) {

                temp_x2 = array[j];
                temp_y2 = array[j + array.length / 2];

                temp_distance = getDistance(temp_x1, temp_y1, temp_x2, temp_y2);

                System.out.println(distance);
                System.out.println(temp_distance);

                if (distance <= temp_distance) {

                    distance = temp_distance;

                    res_x1 = temp_x1;
                    res_y1 = temp_y1;
                    res_x2 = temp_x2;
                    res_y2 = temp_y2;

                }

            }

        }

        System.out.printf("\nНаибольшее растояние между точками [%d; %d] и [%d; %d]", res_x1, res_y1, res_x2, res_y2);

    }


    public static double getDistance(int x1, int y1, int x2, int y2) {

        int delta_x;
        int delta_y;
        double distance;

        delta_x = Math.abs(x1 - x2);
        delta_y = Math.abs(y1 - y2);

        distance = Math.pow((Math.pow(delta_x, 2) + Math.pow(delta_y, 2)), 0.5);

        return distance;

    }


    public static void printCoordinatesFromArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }


        System.out.println("\nПусть даны точки со следующими координатами: ");

        for (int i = 0; i < array.length / 2; i++) {

            System.out.printf("[%d; %d]\n", array[i], array[i + array.length / 2]);  // точки хранятся в массиве в формате:
                                                                                     // [x1, x2, ... xn, y1, y2, ... yn]
        }

    }


    public static void initArray(int[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(20) - 10;

        }

    }

}
