package by.epam.java_introduction.module2.decomposition;

// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Decomposition7 {

    public static void main(String[] args) {

        int n = 9;

        System.out.println("\nСумма факториалов всех нечётных чисел от 1 до 9 равняется " + getSum(n));

    }


    public static int getSum(int num) {

        int sum = 0;

        for (int j = 1; j <= num; j += 2) {

            sum += factorial(j);

        }

        return (sum);

    }


    public static int factorial(int value) {

        int temp = 1;

        for (int i = 1; i <= value; i++) {

            temp *= i;

        }

        return temp;

    }

}
