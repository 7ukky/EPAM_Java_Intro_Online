package by.epam.java_introduction.module1;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class Linear1 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double z;

        a = enterDoubleFromConsole("Введите значение a");
        b = enterDoubleFromConsole("Введите значение b");
        c = enterDoubleFromConsole("Введите значение c");

        z = ((a - 3) * b / 2) + c;

        System.out.println("Значение функции z = ( (a – 3 ) * b / 2) + c");
        System.out.println("при a = " + a);
        System.out.println("при b = " + b);
        System.out.println("при c = " + c);
        System.out.printf("равняется %.4f", z);
    }

    public static double enterDoubleFromConsole(String message) {

        double value;

        Scanner sc = new Scanner(System.in);

        System.out.println(message);

        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Введено некорректное значение");
            System.out.println(message);
        }

        value = sc.nextDouble();

        return value;
    }
}

