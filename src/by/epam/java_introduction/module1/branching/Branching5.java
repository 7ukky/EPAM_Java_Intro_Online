package by.epam.java_introduction.module1.branching;

// Вычислить значение функции:
// F(x) = x^2 - 3x + 9, если x <= 3 и
// F(x) = 1 / (x^3 + 6), если x > 3.

public class Branching5 {


    public static void main(String[] args) {

        double x = 3;

        double f;

        if (x <= 3) {

            f = Math.pow(x, 2) - 3 * x + 9;

        }

        else {

            f = 1 / (Math.pow(x, 3) + 6);

        }

        System.out.printf("При x = %.2f значение функции f = %.4f", x, f);

    }

}
