package by.epam.java_introduction.module2.sorting;

// Даны дроби p1 / q1, p2 / q2, ..., pn / qn (pi, qi - натуральные).
// Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

import java.util.Random;

public class Sorting8 {

    public static void main(String[] args) {

        Fraction[] array = new Fraction[5];

        initArrayOfFractions(array);
        printArrayOfFractions(array, "\nИсходный ряд дробей:");

        bringToCommonDenominator(array);
        printArrayOfFractions(array, "\nРяд дробей, приведённых к общему знаменателю:");

        sortFractions(array);
        printArrayOfFractions(array, "\nОтсортированный ряд:");

    }


    public static void sortFractions(Fraction[] array) {

        boolean needIteration;
        Fraction temp;

        do {

            needIteration = false;

            for (int i = 1; i < array.length; i++) {

                if (array[i - 1].numerator > array[i].numerator) {

                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;

                    needIteration = true;

                }

            }

        }
        while (needIteration);

    }


    private static int getCommonDenominator(Fraction[] array) {

        int value = array[0].denominator;


        for (int i = 1; i < array.length; i++) {

            value = getLeastCommonMultiple(value, array[i].denominator);

        }

        return value;

    }


    public static void bringToCommonDenominator(Fraction[] array) {

        int commonDenominator;

        commonDenominator = getCommonDenominator(array);

        for (int j = 0; j < array.length; j++) {

            array[j].numerator *= commonDenominator / array[j].denominator;
            array[j].denominator = commonDenominator;

        }

    }


    public static void initArrayOfFractions(Fraction[] array) {

        if (array == null) {

            System.out.println("Передана пустая ссылка");
            return;

        }

        int numerator;
        int denominator;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            numerator = random.nextInt(6) + 1;
            denominator = random.nextInt(6) + 1;
            array[i] = new Fraction(numerator, denominator);

        }

    }

    public static void printArrayOfFractions(Fraction[] array, String message) {

        if (array == null) {

            System.out.println("Передана пустая ссылка на массив");
            return;

        }

        System.out.println("\n" + message);

        for (int i = 0; i < array.length; i++) {

            if (array[i].numerator > 99) {

                System.out.print(array[i].numerator + " ");

            }
            else if (array[i].numerator > 9) {

                System.out.print(array[i].numerator + "  ");

            }
            else {

                System.out.print(array[i].numerator + "   ");

            }

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {

            if (array[i].numerator > 99 || array[i].denominator > 99) {

                System.out.print("——— ");

            }
            else if (array[i].numerator > 9 || array[i].denominator > 9) {

                System.out.print("——  ");

            }
            else {

                System.out.print("—   ");

            }

        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {

            if (array[i].denominator > 99) {

                System.out.print(array[i].denominator + " ");

            }
            else if (array[i].denominator > 9) {

                System.out.print(array[i].denominator + "  ");

            }
            else {

                System.out.print(array[i].denominator + "   ");

            }

        }

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
