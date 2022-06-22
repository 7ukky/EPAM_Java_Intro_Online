package by.epam.java_introduction.module1.cycle;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Cycle7 {

    public static void main(String[] args) {

        int number;

        int m;
        int n;

        int i;
        int j;

        boolean hasDivider;

        m = enterPositiveIntFromConsole("Введите натуральное число m");
        n = enterPositiveIntFromConsole("Введите натуральное число n");

        for (i = m; i <= n; i++) {

            hasDivider = false;
            number = i;

            System.out.println("\nЧисло " + number + " кроме 1 и самого себя имеет следующие делители: ");

            for (j = 2; j < number; j++) {

                if (number % j == 0) {

                    hasDivider = true;
                    System.out.println(j + " ");

                }

            }

            if (!hasDivider) {

                System.out.println("не имеет");

            }

        }

    }


    public static int enterPositiveIntFromConsole(String message) {

        int value;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println(message);

            while (!sc.hasNextInt()) {

                sc.next();
                System.out.println("Введено некорректное значение");
                System.out.println(message);

            }

            value = sc.nextInt();

            if (value <= 0) {

                System.out.println("Введено ненатуральное число");

            }

        }
        while (value <= 0);

        return value;

    }

}
