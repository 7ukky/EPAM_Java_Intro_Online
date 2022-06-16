package by.epam.java_introduction.module1;

// Для заданной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае.

import java.util.Scanner;

public class Linear6 {

    public static void main(String[] args) {

        int x;
        int y;

        boolean isIncluded;

        x = enterIntFromConsole("Введите координату x");
        y = enterIntFromConsole("Введите координату y");

        isIncluded = (((Math.abs(x) < 3) && (y < 5 && y > -4)) || ((Math.abs(x) < 5) && (y < 1 && y > -4)));

        System.out.println(isIncluded);
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
