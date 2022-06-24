package by.epam.java_introduction.module2.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Decomposition2 {


    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 5;
        int d = 7;

        int gcd;

        gcd = getGreatestCommonDivisor(a, b, c, d);

        if (gcd == -1) {

            return;

        }

        System.out.printf("\nНаибольший общий делитель чисел %d, %d, %d и %d: %d", a, b, c, d, gcd);

    }


    public static int getGreatestCommonDivisor(int a, int b) {

        if (a <= 0 || b <= 0) {

            System.out.println("\nНельзя вводить ненатуральные числа ");
            return -1;

        }

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


    public static int getGreatestCommonDivisor(int a, int b, int c, int d) {

        int temp1;
        int temp2;
        int gcd;

        temp1 = getGreatestCommonDivisor(a, b);
        temp2 = getGreatestCommonDivisor(c, d);

        if (temp1 == -1 || temp2 == -1) {

            return -1;

        }

        gcd = getGreatestCommonDivisor(temp1, temp2);

        return gcd;

    }

}
