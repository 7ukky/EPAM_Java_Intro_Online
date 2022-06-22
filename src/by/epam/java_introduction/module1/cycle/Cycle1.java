package by.epam.java_introduction.module1.cycle;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Cycle1 {


    public static void main(String[] args) {

        int number;
        int sum = 0;

        int i;

        do {

            number = enterIntFromConsole("Введите натуральное число");

        }
        while (number <= 0);

        for (i = 1; i <= number; i++) {

            sum += i;

        }

        System.out.println("Сумма чисел от 1 до " + number + " равняется " + sum);

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
