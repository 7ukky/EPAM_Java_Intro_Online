package by.epam.java_introduction.module2.decomposition;

// Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Decomposition6 {


    public static void main(String[] args) {

        int a = 74;
        int b = 37;
        int c = 148;

        if (a <= 0 || b <= 0 || c <= 0) {

            System.out.println("\nНельзя вводить ненатуральные числа ");
            return;

        }

        if (isRelativelyPrime(a, b, c)) {

            System.out.printf("\nЧисла %d, %d, %d являются взаимно простыми", a, b, c);

        } else {

            System.out.printf("\nЧисла %d, %d, %d не являются взаимно простыми", a, b, c);

        }

    }


    public static boolean isRelativelyPrime(int a, int b, int c) {

        return getGreatestCommonDivisor(getGreatestCommonDivisor(a, b), c) == 1;

    }


    public static int getGreatestCommonDivisor(int a, int b) {

        int temp;

        if (a < b) {

            temp = a;
            a = b;
            b = temp;

        }

        while (b != 0) {

            temp = a % b;
            a = b;
            b = temp;

        }

        return a;

    }

}
