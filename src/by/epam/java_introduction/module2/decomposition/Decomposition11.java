package by.epam.java_introduction.module2.decomposition;

// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Decomposition11 {


    public static void main(String[] args) {

        int num1 = 2123;
        int num2 = 125665689;

        int result;

        result = compare(num1, num2);

        if (result == 0) {

            System.out.println("\nВ числах одинаковое количество цифр либо одно из чисел 0");

        } else {

            System.out.println("\nЦифр больше в числе " + result);

        }

    }


    public static int compare(int num1, int num2) {

        if (num1 == 0 || num2 == 0) {

            return 0;

        }

        int size1;
        int size2;

        size1 = getSize(num1);
        size2 = getSize(num2);

        if (size1 == size2) {

            return 0;

        } else {

            return size1 > size2 ? num1 : num2;

        }

    }


    public static int getSize(int num) {

        int counter = 0;
        int temp;

        temp = num;

        while (temp != 0) {

            temp /= 10;
            counter++;

        }

        return counter;

    }

}
