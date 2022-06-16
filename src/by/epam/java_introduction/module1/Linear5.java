package by.epam.java_introduction.module1;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
// данное значение длительности в часах, минутах и секундах в следующей форме:
// ННч ММмин SSc.

import java.util.Scanner;

public class Linear5 {

    public static void main(String[] args) {

        int t;

        int hours;
        int minutes;
        int seconds;

        t = Math.abs(enterIntFromConsole("Введите количество секунд"));

        hours = t / 3600;

        t -= hours * 3600;

        minutes = t / 60;
        seconds = t - minutes * 60;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
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
