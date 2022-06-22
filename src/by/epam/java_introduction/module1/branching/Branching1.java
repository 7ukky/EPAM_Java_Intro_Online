package by.epam.java_introduction.module1.branching;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
// он прямоугольным.

import java.util.Scanner;

public class Branching1 {


    public static void main(String[] args) {

        int angle1;
        int angle2;
        int angle3;

        angle1 = Math.abs(enterIntFromConsole("Введите величину первого угла"));
        angle2 = Math.abs(enterIntFromConsole("Введите величину второго угла"));

        angle3 = 180 - (angle1 + angle2);

        if (angle3 > 0 && angle1 > 0 && angle2 > 0) {

            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {

                System.out.println("Треугольник с углами " + angle1 + " и " + angle2 + " градусов существует");
                System.out.println("и является прямоугольным");

            }

            else {

                System.out.println("Треугольник с углами " + angle1 + " и " + angle2 + " градусов существует");
                System.out.println("и не является прямоугольным");

            }

        }

        else {

            System.out.println("Треугольник с углами " + angle1 + " и " + angle2 + " градусов не существует");

        }

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
