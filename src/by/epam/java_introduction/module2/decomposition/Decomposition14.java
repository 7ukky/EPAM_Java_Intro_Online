package by.epam.java_introduction.module2.decomposition;

// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенных в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
// Для решения задачи использовать декомпозицию.

public class Decomposition14 {


    public static void main(String[] args) {

        int k = 100000;

        printArmstrongNumbers(k);

    }


    public static void printArmstrongNumbers(int k) {

        int sum;

        for (int j = 0; j <= k; j++) {

            sum = getSumOfDigitsRaisedToPower(j);

            if (j == sum) {

                System.out.print(j + " ");

            }

        }

    }


    public static int getSizeOfNum(int num) {

        int counter = 0;
        int temp;

        temp = num;

        while (temp != 0) {

            temp /= 10;
            counter++;

        }

        return counter;

    }


    public static int getSumOfDigitsRaisedToPower(int num) {

        int sum = 0;
        int size;

        size = getSizeOfNum(num);

        while (num != 0) {

            sum += Math.pow(num % 10, size);
            num /= 10;

        }

        return sum;

    }

}
