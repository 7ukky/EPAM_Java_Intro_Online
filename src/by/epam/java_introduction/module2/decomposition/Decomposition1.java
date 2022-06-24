package by.epam.java_introduction.module2.decomposition;

// Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
// натуральных чисел.

public class Decomposition1 {


    public static void main(String[] args) {

        int a = 3;
        int b = 9;

        int gcd;
        int lcm;

        gcd = getGreatestCommonDivisor(a, b);

        if (gcd == -1) {

            return;

        }

        lcm = getLeastCommonMultiple(a, b);

        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + ": " + gcd);
        System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + ": " + lcm);

    }


    public static int getLeastCommonMultiple(int a, int b) {

        int lcm;
        int gcd;

        gcd = getGreatestCommonDivisor(a, b);

        lcm = a * b / gcd;

        return lcm;

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


}
