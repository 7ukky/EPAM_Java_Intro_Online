package by.epam.java_introduction.module2.decomposition;

// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

public class Decomposition13 {


    public static void main(String[] args) {

        int n = 7;

        printTwins(n);

    }


    public static void printTwins(int n) {

        int limit;
        int temp1;
        int temp2;

        limit = 2 * n;

        System.out.println("Простые числа \"близнецы\" в диапозоне от " + n + " до " + limit + ": ");

        if (n == 3) {

            System.out.println("3 5");

        }

        else {

            for (int i = 1; 6 * i + 1 <= limit; i++) {

                temp1 = 6 * i - 1;
                temp2 = 6 * i + 1;

                if (temp1 >= n && isPrime(temp1) && isPrime(temp2)) {

                    System.out.println(temp1 + " " + temp2);

                }

            }

        }

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

}
