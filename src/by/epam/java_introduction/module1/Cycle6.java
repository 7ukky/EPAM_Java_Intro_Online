package by.epam.java_introduction.module1;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

import java.util.Scanner;

public class Cycle6 {

    public static void main(String[] args) {

        int i;

        for (i = 0; i <= 1000; i++) {       // Максимум до Integer.MAX_VALUE

            System.out.printf("Численному коду %x соответствует символ %c \n", i, (char) i);
        }
    }
}
