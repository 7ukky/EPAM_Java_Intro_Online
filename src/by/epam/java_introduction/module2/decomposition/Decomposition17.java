package by.epam.java_introduction.module2.decomposition;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
// действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Decomposition17 {


    public static void main(String[] args) {

        int num = 10;

        printQuantity(num);

    }


    public static void printQuantity(int num) {

        int counter = 0;
        int temp;

        while (num != 0) {

            num -= getSumOfDigits(num);
            counter++;

        }

        System.out.println(counter);

    }

    public static int getSumOfDigits(int num) {

        int sum = 0;

        while (num != 0) {

            sum += num % 10;
            num /= 10;

        }

        return sum;

    }

}
