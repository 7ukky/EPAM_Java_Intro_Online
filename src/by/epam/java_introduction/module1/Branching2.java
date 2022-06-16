package by.epam.java_introduction.module1;

// Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class Branching2 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;
        int d;

        int min1;
        int min2;

        a = enterIntFromConsole("Введите величину a");
        b = enterIntFromConsole("Введите величину b");
        c = enterIntFromConsole("Введите величину c");
        d = enterIntFromConsole("Введите величину d");

        min1 = a > b ? b : a;
        min2 = c > d ? d : c;
        outputResultToConsole(min1 > min2 ? min1 : min2);
    }

    public static void outputResultToConsole(int value) {
        System.out.println("max{min(a, b), min(c, d)} = " + value);
    }

    public static int enterIntFromConsole(String message) {

        int value;

        Scanner sc = new Scanner(System.in);

        System.out.println(message);

        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введено некорректное значение");
            System.out.println(message);
        }

        value = sc.nextInt();

        return value;
    }
}
