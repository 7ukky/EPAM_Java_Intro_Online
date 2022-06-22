package by.epam.java_introduction.module2.decomposition;

// Вычислить площадь правильного шестиугольника со стороной а,
// используя метод вычисления площади треугольника.

public class Decomposition3 {


    public static void main(String[] args) {

        int a = 10;
        double square;

        square = getSquareOfRegularHexagon(a);

        if (square == -1) {

            return;

        }

        System.out.printf("\nПлощадь правильного шестиугольника со стороной %d равняется %.3f", a, square);

    }


    private static double getSquareOfRegularHexagon(double side) {

        if (side <= 0) {

            System.out.println("\nВведено нулевое или отрицательное значение стороны");
            return -1;

        }

        double square;

        square = 6 * getSquareOfEquilateralTriangle(side);

        return square;

    }


    private static double getSquareOfEquilateralTriangle(double side) {

        double square;

        square = Math.pow(side, 2) * Math.pow(3, 0.5) / 4;

        return square;
    }

}
