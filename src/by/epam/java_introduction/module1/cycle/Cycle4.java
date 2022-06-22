package by.epam.java_introduction.module1.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Cycle4 {


    public static void main(String[] args) {

        long multi = 1L;
        long square;

        int i;


        for (i = 1; i <= 20; i++) {

            square = (long) Math.pow(i, 2);

            multi *= square;

            if ((Long.MAX_VALUE / Math.pow(i + 1, 2)) < multi) {

                System.out.println("Произведение квадратов первых " + i + " чисел равняется " + multi);
                System.out.println("Дальнейшее умножение не возможно из-за переполнения переменной типа long ");

                break;

            }

        }

    }

}
