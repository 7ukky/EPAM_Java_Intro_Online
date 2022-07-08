package by.epam.java_introduction.module2.decomposition;

// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
// являются числа, сумма цифр которых равна К и которые не большее N.

public class Decomposition12 {


    public static void main(String[] args) {

        int k = 5;
        int n = 1000;

        int[] array;

        array = createArray(k, n);
        printArray(array);

    }


    public static int[] createArray(int k, int n) {

        int size;
        int[] array;


        size = getSizeOfArray(k, n);
        array = new int[size];

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            for (; counter <= n; counter++) {

                if (getSumOfDigits(counter) == k) {

                    array[i] = counter;
                    counter++;
                    break;

                }

            }

        }

        return array;

    }


    public static int getSizeOfArray(int k, int n) {

        int counter = 0;

        for (int i = 1; i <= n; i++) {

            if (getSumOfDigits(i) == k) {

                counter++;

            }

        }

        return counter;

    }


    public static int getSumOfDigits(int num) {

        int sum = 0;

        while (num != 0) {

            sum += num % 10;
            num /= 10;

        }

        return sum;

    }


    public static void printArray(int[] array) {

        System.out.println("\nПолученный массив: ");

        for (int j : array) {

            System.out.print(j + " ");

        }

    }

}


