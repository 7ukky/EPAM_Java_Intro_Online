package by.epam.java_introduction.module1.cycle;

// Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид: a(n) = 1 / 2^n + 1 / 3^n

public class Cycle5 {


    public static void main(String[] args) {

        double e = 3;

        double a;
        double sum = 0;

        int i;

        for (i = -5; i < 5; i++) {

            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

            if (Math.abs(a) >= e) {

                sum += a;

            }

        }

        System.out.println("Сумма равняется " + sum);

    }

}
