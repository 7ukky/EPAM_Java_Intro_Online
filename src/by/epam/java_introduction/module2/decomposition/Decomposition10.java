package by.epam.java_introduction.module2.decomposition;

// Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
// являются цифры числа N

public class Decomposition10 {


    public static void main(String[] args) {

        int num = 2022;

        int[] array;

        array = createArray(num);
        printArray(array);

    }


    private static void printArray(int[] array) {

        for (int j : array) {

            System.out.print(j + " ");

        }

    }


    public static int[] createArray(int num) {

        int size;
        int[] array;

        int temp;

        size = getSize(num);
        temp = num;

        array = new int[size];

        for (int i = size; i > 0; i--) {

            array[i - 1] = temp % 10;
            temp /= 10;

        }

        return array;

    }


    private static int getSize(int num) {

        int counter = 0;
        int temp;

        temp = num;

        while (temp != 0) {

            temp /= 10;
            counter++;

        }

        return counter;

    }

}
