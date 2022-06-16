package by.epam.java_introduction.module1;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.


public class Branching4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int x = 15;
        int y = 11;
        int z = 20;

        if ((a >= x && b >= y) || (b >= x && a >= y)) {

            System.out.println("Кирпич пройдёт через отверстие");
        }

        else if ((a >= z && b >= y) || (b >= z && a >= y)) {

            System.out.println("Кирпич пройдёт через отверстие");
        }

        else if ((a >= z && b >= x) || (b >= z && a >= x)) {

            System.out.println("Кирпич пройдёт через отверстие");
        }

        else {

            System.out.println("Кирпич не пройдёт через отверстие");
        }
    }
}
