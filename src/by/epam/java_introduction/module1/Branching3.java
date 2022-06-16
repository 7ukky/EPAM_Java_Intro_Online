package by.epam.java_introduction.module1;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Branching3 {

    public static void main(String[] args) {

        double x1 = 2.3;
        double y1 = 2.3;

        double x2 = 2.3;
        double y2 = 2.3;

        double x3 = 2.5;
        double y3 = 2.5;

        if (arePointsMatching(x1, y1, x2, y2, x3, y3)) {

            System.out.println("Точки накладываются друг на друга. Нельзя корректно определить результат");
        }

        else if (x1 == x2 || x1 == x3 || x2 == x3) {

            if (x1 == x2 && x1 == x3) {

                System.out.println("Точки лежат на одной плоскости");
            }

            else {
                System.out.println("Точки лежат на одной плоскости");
            }
        }

        else if (((y3 - y1) / (x3 - x1)) == ((y2 - y1) / (x2 - x1))) {

            System.out.println("Точки лежат на одной плоскости");
        }

        else {

            System.out.println("Точки не лежат на одной плоскости");
        }
    }

    public static boolean arePointsMatching (double x1, double y1, double x2, double y2, double x3, double y3) {

        if (x1 == x2 && y1 == y2) {
            return true;
        }

        else if (x1 == x3 && y1 == y3) {
            return true;
        }

        else if (x2 == x3 && y2 == y3) {
            return true;
        }

        else {
            return false;
        }
    }
}
