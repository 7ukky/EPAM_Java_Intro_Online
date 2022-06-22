package by.epam.java_introduction.module1.cycle;

// Вычислить значения функции на отрезке [а,b] c шагом h:
// y = x, если x > 2
// y = -x, если x <= 2

public class Cycle2 {


    public static void main(String[] args) {

        int a = -5;
        int b = 10;

        int h = 2;

        int x;

        int i;

        for (i = a; i <= b; i += h) {

            if (i > 2) {

                x = i;
                System.out.println("Значение функции при x = " + i + " равняется " + x);

            }

            else {

                x = -i;
                System.out.println("Значение функции при x = " + i + " равняется " + x);

            }

        }

    }

}

