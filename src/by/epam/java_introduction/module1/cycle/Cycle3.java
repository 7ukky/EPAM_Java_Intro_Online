package by.epam.java_introduction.module1.cycle;

// Найти сумму квадратов первых ста чисел.

public class Cycle3 {


    public static void main(String[] args) {

        int sum = 0;
        int current;

        int i;


        for (i = 1; i <= 100; i++) {

            current = i;
            sum += Math.pow(current, 2);

        }

        System.out.println("Сумма квадратов первых ста чисел равняется " + sum);

    }

}
