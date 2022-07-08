package by.epam.java_introduction.module2.decomposition;

// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Decomposition16 {


    public static void main(String[] args) {

        int n = 2;
        int sum;

        if (n > 5) {

            System.out.println("Невозможно рассчитать сумму из-за переполнения используемого типа даннных");

        }

        sum = getSum(n);
        System.out.println("\nCумма " + n + "-значных чисел, содержащих только нечетные цифры равняется " + sum);

        printQuantity(sum);

    }


    public static void printQuantity(int num) {

        int counter = 0;
        int buff;

        if (num == 0) {

            counter = 1;

        }

        while (num != 0) {

            buff = num % 10;

            if (!isOdd(buff)) {

                counter++;

            }

            num /= 10;

        }

        System.out.println("Число суммы состоит из " + counter + " чётных цифр");

    }


    public static int getSum(int n) {

        int sum = 0;

        int startLimit;
        int endLimit;

        startLimit = getStartLimit(n);
        endLimit = (int) Math.pow(10, n);

        for (int j = startLimit; j < endLimit; j++) {

            if (isConsistOfOddDigits(j)) {

                sum += j;

            }

        }

        return sum;

    }


    public static boolean isConsistOfOddDigits(int num) {

        int temp;
        int buff;

        temp = num;

        while (temp != 0) {

            buff = temp % 10;

            if (!isOdd(buff)) {

                return false;

            }

            temp /= 10;

        }

        return true;

    }


    public static int getStartLimit(int n) {

        int num = 0;

        for (int i = 0; i < n; i++) {

            num += Math.pow(10, i);

        }

        return num;

    }


    public static boolean isOdd(int num) {

        return num % 2 != 0;

    }

}
