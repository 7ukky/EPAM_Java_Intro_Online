package by.epam.java_introduction.module1.cycle;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Cycle8 {


    public static void main(String[] args) {

        int a = 111;
        int b = 11;

        int temp_a;
        int temp_b;

        int temp;

        int i;
        int j;

        int length_a;
        int length_b;

        length_a = getNumberLength(a);
        length_b = getNumberLength(b);

        if (length_a > length_b) {

            temp = a;
            a = b;
            b = temp;

            temp = length_a;
            length_a = length_b;
            length_b = temp;

        }

        for (i = 0; i < length_a; i++) {

            temp_a = a % 10;

            temp_b = b;

            for (j = 0; j < length_b; j++) {

                if ((temp_b % 10) == temp_a) {

                    System.out.println(temp_a);
                    break;

                }

                else {

                    temp_b /= 10;

                }

            }

            a /= 10;

        }

    }

    public static int getNumberLength(int number) {

        int length = 0;

        if (number == 0) {

            return 1;

        }

        while (number != 0) {

            number /= 10;
            length++;

        }

        return length;

    }

}
