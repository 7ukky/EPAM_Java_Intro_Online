package by.epam.java_introduction.module2.decomposition;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//  если угол между сторонами длиной X и Y— прямой.

public class Decomposition9 {


    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int z = 7;
        int t = 8;

        double square;

        square = getSquare(x, y, z, t);

        System.out.printf("\nПлощадь четырёхугольника со сторонами %d, %d, %d и %d\n", x, y, z, t);
        System.out.printf("и прямым углом между стронами с величинами %d и %d равняется %.2f\n", x, y, square);

    }


    public static double getSquare(int x, int y, int z, int t) {

        double s1;
        double s2;

        double diagonal;
        double semi_perimeter;

        diagonal = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        semi_perimeter = (diagonal + t + z) / 2;

        s1 = x * y * 0.5;

        s2 = Math.sqrt(semi_perimeter * (semi_perimeter - diagonal) * (semi_perimeter - z) * (semi_perimeter - t));


        return s1 + s2;

    }

}
