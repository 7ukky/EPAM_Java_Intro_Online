package by.epam.java_introduction.module1.linear;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)

import java.util.Scanner;

public class Linear3 {


    public static void main(String[] args) {

        double x;
        double y;

        double temp;

        x = enterDoubleFromConsole("Введите значение x в радианах");
        y = enterDoubleFromConsole("Введите значение y в радианах");

        temp = Math.cos(x) - Math.sin(y);

        while (temp == 0 || Math.cos(x * y) == 0) {

            System.out.println("Введённые значения переменных не входят в ОДЗ");

            x = enterDoubleFromConsole("Введите значение x в градусах");
            y = enterDoubleFromConsole("Введите значение y в градусах");

            temp = Math.cos(x) - Math.sin(y);

        }

        temp = (Math.sin(x) + Math.cos(y)) / temp;
        temp *= Math.tan(x * y);

        System.out.println("Значение выражения (sin(x) + cos(y)) / (cos(x) - sin(y)) * tg(xy)");
        System.out.println("при x = " + x);
        System.out.println("при y = " + y);
        System.out.printf("равняется %.4f", temp);

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
