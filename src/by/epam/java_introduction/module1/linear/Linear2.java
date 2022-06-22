package by.epam.java_introduction.module1.linear;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b + square_root((b^2) + 4ac)) / 2a - a^3 * c + b^(-2)

import java.util.Scanner;

public class Linear2 {


    public static void main(String[] args) {

        double a;
        double b;
        double c;

        double temp;

        a = enterDoubleFromConsole("Введите значение a");
        b = enterDoubleFromConsole("Введите значение b");
        c = enterDoubleFromConsole("Введите значение c");

        temp = Math.pow(b, 2) + 4 * a * c;

        while ((temp < 0) || (a == 0)) {

            System.out.println("Введённые значения переменных не входят в ОДЗ");

            a = enterDoubleFromConsole("Введите значение a");
            b = enterDoubleFromConsole("Введите значение b");
            c = enterDoubleFromConsole("Введите значение c");

            temp = Math.pow(b, 2) + 4 * a * c;

        }

        temp = (Math.sqrt(temp) + b) / (2 * a);
        temp = temp - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Значение выражения (b + square_root((b^2) + 4ac)) / 2a - a^3 * c + b^(-2)");
        System.out.println("при a = " + a);
        System.out.println("при b = " + b);
        System.out.println("при c = " + c);
        System.out.printf("равняется %f", temp);

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
